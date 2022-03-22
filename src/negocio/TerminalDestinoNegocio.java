/** Clase Negocio para TERMINALDESTINO. Se encarga de pasar los elementos
 * a la vista gráfica del programa, maneja todos los métodos
 * para que Swing pueda acceder a los datos.
 */

package negocio;

import datos.CiudadDestinoDatos;
import datos.TerminalDestinoDatos;
import entidades.CiudadDestino;
import entidades.TerminalDestino;
import java.util.List;

public class TerminalDestinoNegocio 
{
    private static TerminalDestinoNegocio instancia;
    
    public static TerminalDestinoNegocio getInstancia()
    {
        if(instancia == null)
            instancia = new TerminalDestinoNegocio();
        return instancia;
    }
    
    public int crearTerminalDestino(TerminalDestino terminalDestino) throws Exception
    {
        int registrosAfectados = TerminalDestinoDatos.getInstancia().ingresar(terminalDestino);
        return registrosAfectados;
    }
    
    public List<CiudadDestino> listaCiudadesDestino() throws Exception
    {
        List<CiudadDestino> ciudades = CiudadDestinoDatos.getInstancia().listado();
        return ciudades;
    }
    
    public CiudadDestino buscarCiudad(String nombre) throws Exception
    {
        CiudadDestino ciudadDestino = CiudadDestinoDatos.getInstancia().buscarPorNombre(nombre);
        return ciudadDestino;
    }
}
