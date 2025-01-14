
package AccesoADatos;

import Vistas.Utilidades;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Conexion {
    
    private static final String URL="jdbc:mysql://localhost:3306/";
    private static final String DB="universidadejemplo";
    private static final String USUARIO="root";
    private static final String PASSWORD="admin";
    private static Connection connection;
    
    private Conexion(){    
    }
    
    public static  Connection getConexion(){
        
        if (connection == null) {
            
            try {
                
                Class.forName("com.mysql.cj.jdbc.Driver");

                connection = DriverManager.getConnection(URL + DB , USUARIO , PASSWORD);

                 Utilidades.mostrarDialogoTemporal("Base de datos", "Conectado ", 2000);

            } catch (ClassNotFoundException ex) {              
                Utilidades.mostrarDialogoTemporal("Base de datos", "Error al cargar los Drivers: " + ex.getMessage(), 2000);
                
            } catch (SQLException ex) {
                Utilidades.mostrarDialogoTemporal("Base de datos", "Error a Conectarse a la Base Datos" + ex.getMessage(), 2000);
            } 
        }
        
        return connection;
    
    }  

    PreparedStatement prepareStatement(String sql, int RETURN_GENERATED_KEYS) {
        
        throw new UnsupportedOperationException("Not supported yet."); 
    }    
}
