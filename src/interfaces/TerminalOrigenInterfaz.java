/** Interfaz para TerminalOrigen.
 * Agrega los métodos ingresar, buscar (listado), buscar (individual) 
 * y buscarPorID con el catch de SQLException
 */

package interfaces;

import entidades.TerminalOrigen;
import java.sql.SQLException;
import java.util.List;

public interface TerminalOrigenInterfaz 
{
    public int ingresar(TerminalOrigen terminal) throws SQLException;
    
    public List<TerminalOrigen> buscar() throws SQLException;
    
    public TerminalOrigen buscar(String nombre) throws SQLException;
    
    public TerminalOrigen buscarPorID(String id) throws SQLException;
}
