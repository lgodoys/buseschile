/** Interfaz para Pasaje.
 * Agrega los métodos ingresar, buscar, modificarEstado y buscarPorID con el catch de SQLException
 */

package interfaces;

import entidades.Pasaje;
import java.sql.SQLException;
import java.util.List;

public interface PasajeInterfaz 
{
    public int ingresar(Pasaje pasaje) throws SQLException;
    
    public List<Pasaje> buscar(String estado) throws SQLException;
    
    public int modificarEstado(Pasaje pasaje) throws SQLException;
    
    public Pasaje buscarPorID(String idPasaje) throws SQLException;
}
