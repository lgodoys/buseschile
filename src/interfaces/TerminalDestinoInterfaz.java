/** Interfaz para TerminalDestino.
 * Agrega los métodos ingresar, buscar (listado), buscar (individual)
 * y buscarPorID con el catch de SQLException
 */

package interfaces;

import entidades.TerminalDestino;
import java.sql.SQLException;
import java.util.List;

public interface TerminalDestinoInterfaz 
{
    public int ingresar(TerminalDestino destino) throws SQLException;
    
    public List<TerminalDestino> buscar() throws SQLException;
    
    public TerminalDestino buscar(String nombre) throws SQLException;
    
    public TerminalDestino buscarPorID(String id) throws SQLException;
}
