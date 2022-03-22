/**
 * Clase Conexion para generar la conexión a la Base de Datos
 * Define los parámetros de conexión requeridos por el Driver
 * y también define los parámetros para poder operar sobre la
 * Base de Datos. Se utiliza una base de datos MySQL, usando
 * la librería Java SQL
 * 
 */
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Genera la clase Conexion que es utilizada en todos los métodos de las demás clases
public class Conexion {
    
    private static Conexion instancia;
    //Genera una instancia nueva (método constructor)    
    public static Conexion getInstancia(){
        if(instancia == null)
            instancia = new Conexion();
        return instancia;
    }

    /**Genera el método para realizar la conexión a la BD
     */
    
    public Connection miConexion() throws SQLException{
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error cargar el driver.");
        }
        
        try {
            String url = "jdbc:mysql://localhost:3306/pasajes";
            conexion = DriverManager.getConnection(url,"root","W4rw1ck.2021365");   
        } catch (SQLException e) {
            throw e;
        }
        
        return conexion;
    }
}
