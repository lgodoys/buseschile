/** Clase Negocio para TERMINALORIGEN. Se encarga de pasar los elementos
 * a la vista gráfica del programa, maneja todos los métodos
 * para que Swing pueda acceder a los datos.
 */

package negocio;

import datos.CiudadOrigenDatos;
import datos.TerminalOrigenDatos;
import entidades.CiudadOrigen;
import entidades.TerminalOrigen;
import java.util.List;

public class TerminalOrigenNegocio 
{
    private static TerminalOrigenNegocio instancia;
    
    public static TerminalOrigenNegocio getInstancia()
    {
        if(instancia == null)
            instancia = new TerminalOrigenNegocio();
        return instancia;
    }
    
    public int crearTerminalOrigen(TerminalOrigen terminalOrigen) throws Exception
    {
        int registrosAfectados = TerminalOrigenDatos.getInstancia().ingresar(terminalOrigen);
        return registrosAfectados;
    }
    
    public List<CiudadOrigen> listaCiudadesOrigen() throws Exception
    {
        List<CiudadOrigen> ciudades = CiudadOrigenDatos.getInstancia().listado();
        return ciudades;
    }
    
    public CiudadOrigen buscarCiudad(String nombre) throws Exception
    {
        CiudadOrigen ciudadOrigen = CiudadOrigenDatos.getInstancia().buscarPorNombre(nombre);
        return ciudadOrigen;
    }
}
