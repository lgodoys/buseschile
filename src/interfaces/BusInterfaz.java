/** Interfaz para Bus.
 * Agrega los métodos ingresar y buscar con el catch de SQLException
 */
package interfaces;

import entidades.Bus;
import java.sql.SQLException;

public interface BusInterfaz 
{
    public int ingresar(Bus bus) throws SQLException;
    
    public Bus buscar(String codigo) throws SQLException;
}
