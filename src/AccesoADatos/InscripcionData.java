
package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import Vistas.Utilidades;

public class InscripcionData {
    
    private Connection con=null;
    private Alumno alu = new Alumno();
    private Materia mat = new Materia();
    private MateriaData md = new MateriaData();
    private AlumnoData ad = new AlumnoData();
    
    public InscripcionData() {
        
        con = Conexion.getConexion();
    
    }
    
    public void guardarInscripcion(Inscripcion ins){
       
        String sql="INSERT INTO `inscripcion`(`idAlumno`, `idMateria`, `nota`) VALUES (?,?,?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, ins.getAlumno().getIdAlumno());
            ps.setInt(2, ins.getMateria().getIdMateria());
            ps.setDouble(3, ins.getNota());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                
                ins.setIdInscripcion(rs.getInt(1));
                
                Utilidades.mostrarDialogoTemporal("Tabla Inscripcion", "Inscripcion exitosa", 2000); 
            }
            
            ps.close();

        } catch (SQLException ex) {           
             Utilidades.mostrarDialogoTemporal("Tabla Inscripcion", "Error  al acceder a la tabla inscripcion "
                     + ex.getMessage(), 2000);
        } 
    }
    
    public List<Inscripcion> ObtenerInscripciones(){
        
        ArrayList<Inscripcion> inscripcionList = new ArrayList<>();
        
        String sql="SELECT * FROM inscripcion";
                
        try {

            PreparedStatement ps;
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {

                Inscripcion ins = new Inscripcion();
                ins.setIdInscripcion(rs.getInt("IdInscripto"));
                ins.setNota(rs.getDouble("Nota"));
                alu = ad.buscarAlumno(rs.getInt("idAlumno"));
                mat = md.buscarMateria(rs.getInt("idMateria"));
                ins.setAlumno(alu);
                ins.setMateria(mat);
                inscripcionList.add(ins);
            }

            ps.close();

        } catch (SQLException ex) {
           Utilidades.mostrarDialogoTemporal("Tabla Inscripcion", "Error  al acceder a la tabla inscripcion "
                     + ex.getMessage(), 2000);
        }

        return inscripcionList;
    }
  
    public List<Inscripcion> ObternerInscripcionesPorAlumno(int idAlumno) {

        ArrayList<Inscripcion> inscripcionListAlu = new ArrayList<>();

        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        
        try {	
           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()) {                
                
                Inscripcion insc=new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                alu=ad.buscarAlumno(rs.getInt("idAlumno"));
                mat=md.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));
                inscripcionListAlu.add(insc);      
            }
            
            ps.close();            
            
        } catch (SQLException ex) {  
            Utilidades.mostrarDialogoTemporal("Tabla Inscripcion", "Error  al acceder a la tabla inscripcion "
                     + ex.getMessage(), 2000);
        }
               
        return inscripcionListAlu;
    }
    
    public List<Materia> ObtenerMateriasCursadas(int idAlumno) {

        ArrayList<Materia> materiasCursadas = new ArrayList<>();
        
        String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion, "
                + "materia WHERE inscripcion.idMateria = materia.idMateria "
                + "AND inscripcion.idAlumno = ?";
        
        try {
           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
               
               Materia materia = new Materia();
               materia.setIdMateria(rs.getInt("idmateria"));
               materia.setNombre(rs.getString("nombre"));
               materia.setAnio(rs.getInt("año"));
             
               materiasCursadas.add(materia);
            }
           
            ps.close();

        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Tabla Inscripcion", "Error  al acceder a la tabla inscripcion "
                     + ex.getMessage(), 2000);
        }

        return materiasCursadas;
    }
    
    public List<Materia> ObtenerMateriasNOCursadas(int idAlumno) {

        ArrayList<Materia> materiasNOCursadas = new ArrayList<>();
        
        String sql = "SELECT * FROM materia WHERE estado = 1 and idMateria not in" 
                + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        
        try {
           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
               
               Materia materia = new Materia();
               materia.setIdMateria(rs.getInt("idmateria"));
               materia.setNombre(rs.getString("nombre"));
               materia.setAnio(rs.getInt("año"));
             
               materiasNOCursadas.add(materia);
            }

            ps.close();

        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Tabla Inscripcion", "Error  al acceder a la tabla inscripcion "
                     + ex.getMessage(), 2000);
        }

        return materiasNOCursadas;

    }
    
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){ 
           
        ArrayList<Alumno> alumnoMateria=new ArrayList<>();
    
        String sql="SELECT a.idAlumno, dni, nombre, apellido, fechaNacimiento, estado "
                +"FROM inscripcion i,alumno a WHERE i.idAlumno = a.idAlumno and idMateria = ? and a.estado = 1 ";
        
        try {
            
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) { 
                
                Alumno alumno=new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                alumnoMateria.add(alumno); 
            }
            
            ps.close(); 
            
        } catch (SQLException ex) {   
            Utilidades.mostrarDialogoTemporal("Tabla Inscripcion", "Error  al acceder a la tabla inscripcion "
                     + ex.getMessage(), 2000);    
        }
        
         return alumnoMateria;               
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota ){
        
        String sql="UPDATE inscripcion SET nota = ? WHERE idAlumno = ? and idMateria = ? ";
        
        PreparedStatement ps;
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            
            int filas = ps.executeUpdate();
            
            if (filas>0) {
                
                Utilidades.mostrarDialogoTemporal("Tabla Inscripcion", "Nota Actualizada Corectamente", 2000);
            }
            
            ps.close();        
            
        } catch (SQLException ex) {    
            Utilidades.mostrarDialogoTemporal("Tabla Inscripcion", "Error  al acceder a la tabla inscripcion "
                     + ex.getMessage(), 2000);
        }      
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno ,int idMateria){
   
        String sql="DELETE FROM inscripcion WHERE idAlumno = ? and idMateria = ?";
        
        try {
            
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            
            int filas=ps.executeUpdate();
            
            if (filas>0) {
                
                 Utilidades.mostrarDialogoTemporal("Tabla Inscripcion",  "Inscripcion borrada Correctamente eliminada", 2000);                
            }
            
            ps.close();
            
        } catch (SQLException ex) {    
            Utilidades.mostrarDialogoTemporal("Tabla Inscripcion", "Error  al acceder a la tabla inscripcion "
                     + ex.getMessage(), 2000);
        }    
    }
}
