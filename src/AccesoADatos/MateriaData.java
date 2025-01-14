
package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Entidades.Materia;
import Vistas.Utilidades;
import java.util.List;
import java.util.ArrayList;


public class MateriaData {
    
    private Connection con = null;

    public MateriaData() {
    
        con = Conexion.getConexion(); 
    }
    
    public void guardarMateria(Materia mat){
       
        String sql="INSERT INTO materia (nombre, año, estado) VALUES (?, ?, ?)";
        
        PreparedStatement ps;
        
        try {
            
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           
            ps.setString(1, mat.getNombre());
            ps.setInt(2,mat.getAnio());
            ps.setBoolean(3, mat.isEstado());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
           
            if (rs.next()) {

                mat.setIdMateria(rs.getInt(1));
                Utilidades.mostrarDialogoTemporal("Tabla materia", "Materia Guardada ", 2000);
            }
            
            ps.close();

        } catch (SQLException ex) {    
            Utilidades.mostrarDialogoTemporal("Tabla materia",  "Error al acceder a la tabla materia " + ex.getMessage(), 2000);
        }
   
    } 
    
    public Materia buscarMateria(int id) {

        String sql="SELECT nombre, año, estado FROM materia WHERE idMateria = ?";
        Materia materia = new Materia();
        PreparedStatement ps = null;
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            
            if (rs.next()) {
                
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
                
            }else{
                
                Utilidades.mostrarDialogoTemporal("Tabla materia", "No exite esa materia", 2000); 
            }
            
            ps.close();
            
        } catch (SQLException ex) {                    
            Utilidades.mostrarDialogoTemporal("Tabla materia",  "Error al acceder a la tabla materia " + ex.getMessage(), 2000);
        }
        
        return materia;     
    } 
    
    public void modificarMateria(Materia materia){
        
        String sql="UPDATE materia SET nombre= ?, año= ?, estado= ? WHERE idMateria=?";
                
        try {
            
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3,materia.isEstado());
            ps.setInt(4, materia.getIdMateria());
                       
            int exito= ps.executeUpdate();
            
            if (exito==1) {
                
                Utilidades.mostrarDialogoTemporal("Tabla materia", "Materia Modificada", 2000);
            }
            
            ps.close();
            
        } catch (SQLException ex) {           
            Utilidades.mostrarDialogoTemporal("Tabla materia", "Error al acceder a la tabla materia " + ex.getMessage(), 2000);
        }
    }
    
    public void eliminarMateria(int id) {

        String sql = "DELETE FROM materia WHERE idMateria = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            
            if(exito==1){
                
               Utilidades.mostrarDialogoTemporal("Tabla materia", " Materia eliminada ", 2000);
            }
           
            ps.close();

        } catch (SQLException ex) {            
            Utilidades.mostrarDialogoTemporal("Tabla materia", "Error al acceder a la tabla materia " + ex.getMessage(), 2000);
        }
    }
    
    public List<Materia> ListarMaterias(){
        
        ArrayList<Materia> materiaList = new ArrayList<>();
        
        String sql="SELECT idMateria, nombre, año, estado FROM materia";
                
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
                
                materiaList.add(materia);
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {    
            Utilidades.mostrarDialogoTemporal("Tabla materia", "Error al acceder a la tabla materia " + ex.getMessage(), 2000);
        }
          
        return materiaList;   
    } 
}
