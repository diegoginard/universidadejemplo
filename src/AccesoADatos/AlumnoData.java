
package AccesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Entidades.Alumno;


public class AlumnoData {
   
    private Connection con = null;
      
    public AlumnoData(){
        
        con = Conexion.getConexion();      
    }
    
    public void guardarAlumno(Alumno alumno ){
        
        String sql="INSERT INTO alumno (apellido, nombre , dni, fechaNacimiento ,estado) VALUES(?,?,?,?,?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            ps.setString(1, alumno.getApellido());
            ps.setString(2, alumno.getNombre());
            ps.setInt(3, alumno.getDni());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
           
            if (rs.next()) {
                
               Vistas.Utilidades.mostrarDialogoTemporal("Tabla alumno", "Alumno Guardado ", 2000);            
            }
            
            ps.close();

        } catch (SQLException ex) {            
            Vistas.Utilidades.mostrarDialogoTemporal("Tabla alumno",  "Error  al acceder a la tabla alumno " + ex.getMessage(), 2000);
        }     
    }
    
    public void modificarAlumno(Alumno alumno){
        
        String sql="UPDATE alumno SET apellido= ?, nombre= ?, dni= ?, fechaNacimiento= ?, estado= ? WHERE idAlumno = ?";
                
        try {
            
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setString(1, alumno.getApellido());
            ps.setString(2, alumno.getNombre());
            ps.setInt(3, alumno.getDni());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isActivo());
            ps.setInt(6    , alumno.getIdAlumno());
            int exito= ps.executeUpdate();
            
            if (exito==1) {    
                
                Vistas.Utilidades.mostrarDialogoTemporal("Tabla alumno",  "Alumno Modificado", 2000);
            }     
            
        } catch (SQLException ex) {           
            Vistas.Utilidades.mostrarDialogoTemporal("Tabla alumno", "Error "+ex.getMessage(), 2000);       
        }        
    }
    
    public void eliminarAlumno(int id) {

        String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            int exito = ps.executeUpdate();
            
            if (exito==1) {    
                
                Vistas.Utilidades.mostrarDialogoTemporal("Tabla alumno",  "Alumno eliminado", 2000);
            }     

        } catch (SQLException ex) {           
            Vistas.Utilidades.mostrarDialogoTemporal("Tabla alumno",  " Error al Eliminar la tabla " + ex.getMessage(), 2000);
        }
    }
    
    public Alumno buscarAlumno(int id){
        
        String sql="SELECT * FROM alumno WHERE idAlumno = ? AND estado = 1";
        Alumno alumno=null;
        PreparedStatement ps = null;
        
        try {
            
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            
            if (rs.next()) {
                
                alumno=new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString ("Apellido"));
                alumno.setNombre(rs.getString ("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
                
            }else{
                
                Vistas.Utilidades.mostrarDialogoTemporal("Tabla alumno", "No existe ese alumno", 2000);
            }
            
            ps.close();
            
        } catch (SQLException ex) {           
            Vistas.Utilidades.mostrarDialogoTemporal("Tabla alumno", "Error al buscar Alumno " + ex.getMessage(), 2000);
        }
        
        return alumno;   
    }
    
    public Alumno buscarAlumnoDni(int dni) {

        String sql = "SELECT idAlumno, apellido, nombre, dni, fechaNacimiento, estado FROM alumno WHERE dni=? ";
        PreparedStatement ps = null;
        Alumno alumno = new Alumno();
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
   
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));

            } else {    
                Vistas.Utilidades.mostrarDialogoTemporal("Tabla alumno", "No existe el alumno", 2000);
            }
            
            ps.close();
        
        } catch (SQLException ex) {   
            Vistas.Utilidades.mostrarDialogoTemporal("Tabla alumno", "Error al acceder a la tabla Alumno " + ex.getMessage(), 2000);        
        }

        return alumno;      
    }
    
    public List<Alumno> listarAlumnos() {

        List<Alumno> alumnos = new ArrayList<>();
        
        try {
            
            String sql = "SELECT * FROM alumno WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Alumno alumno = new Alumno();

                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                alumnos.add(alumno);            
            }
            
            ps.close();

        } catch (SQLException ex) {
            Vistas.Utilidades.mostrarDialogoTemporal("Tabla alumno", " Error al acceder a la tabla Alumno " + ex.getMessage(), 2000);
        }

        return alumnos;
    }

    public void eliminarAlumnoDni(int dni) {

        String sql = "UPDate alumno SET estado = 0 WHERE dni = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            
            int exito = ps.executeUpdate();
            
            if (exito==1) {    
                
                Vistas.Utilidades.mostrarDialogoTemporal("Tabla alumno",  "Alumno eliminado", 2000);
            }    
        
        } catch (SQLException ex) {            
            Vistas.Utilidades.mostrarDialogoTemporal("Tabla alumno", "Error al Eliminar el alumno" + ex.getMessage(), 2000);
        }
    }
    
    public Alumno buscarAlumnoT(int id){
        
        String sql="SELECT * FROM alumno WHERE idAlumno = ?";
        Alumno alumno = new Alumno();
        PreparedStatement ps = null;
        
        try {
            
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            
            if (rs.next()) {

                alumno.setIdAlumno(id); 
                alumno.setApellido(rs.getString ("Apellido"));
                alumno.setNombre(rs.getString ("nombre"));
                 alumno.setDni(rs.getInt("dni"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                
            }else{
                
                Vistas.Utilidades.mostrarDialogoTemporal("Tabla alumno","No existe ese alumno", 2000);
            }
            
            ps.close();
            
        } catch (SQLException ex) {            
            Vistas.Utilidades.mostrarDialogoTemporal("Tabla alumno", "Error al buscar Alumno "+ex.getMessage(), 2000);
        }
        
        return alumno;    
    }
}