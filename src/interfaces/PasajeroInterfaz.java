/** Interfaz para Pasajero.
 * Agrega los métodos ingresar, modificar, eliminar, buscar, 
 * buscarPorID y buscarPorRUT con el catch de SQLException
 */

package interfaces;

import entidades.Pasajero;
import java.sql.SQLException;
import java.util.List;

public interface PasajeroInterfaz 
{
    public int ingresar(Pasajero pasajero) throws SQLException;
    
    public int modificar(Pasajero pasajero) throws SQLException;
    
    public int eliminar(Pasajero pasajero) throws SQLException;
    
    public List<Pasajero> buscar(String nombre) throws SQLException;
    
    public Pasajero buscarPorID(String idPasajero) throws SQLException;
    
    public Pasajero buscarPorRUT(String rut) throws SQLException;
    
}
