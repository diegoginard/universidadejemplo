
package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Entidades.Materia;
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
                JOptionPane.showMessageDialog(null, "Materia Guardada ");
            
            }
            
            ps.close();

        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error  al acceder a la tabla materia "+ex.getMessage());
        
        }
   
    } 
    
    public Materia buscarMateria(int id) {

        String sql="SELECT nombre, año, estado FROM materia WHERE idMateria = ? AND estado = 1";
        Materia materia = null;
        PreparedStatement ps = null;

        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            
            if (rs.next()) {
                
                materia=new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setEstado(true);
//                JOptionPane.showMessageDialog(null," Materia encontrada");
                
            }else{
                
                JOptionPane.showMessageDialog(null,"No exite esa materia");
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {         
            
            JOptionPane.showMessageDialog(null, "Error al buscar la materia "+ex.getMessage());

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
            
            int exito= ps.executeUpdate();
            
            if (exito==1) {
                
                JOptionPane.showMessageDialog(null, "Materia Modificada");
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Error al conectar con tabla materia"+ex.getMessage());
        
        }
    }
    
    public void eliminarMateria(int id) {

        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            
            if(exito==1){
                
                JOptionPane.showMessageDialog(null, " Materia eliminada ");
                }
           
            ps.close();

        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, " Error al Eliminar la fila " + ex.getMessage());

        }

    }
    
    public List<Materia> ListarMaterias(){
        
        ArrayList<Materia> materiaList = new ArrayList<>();
        
            String sql="SELECT idMateria, nombre, año, estado FROM materia WHERE estado = 1";
                
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
            
            JOptionPane.showMessageDialog(null,"Error al conectar con tabla materia"+ex.getMessage());
        }
          
        return materiaList;
    
    }
        
}
