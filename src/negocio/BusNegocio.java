/** Clase Negocio para BUS. Se encarga de pasar los elementos
 * a la vista gráfica del programa, maneja todos los métodos
 * para que Swing pueda acceder a los datos.
 */

package negocio;

import datos.BusDatos;
import datos.TerminalDestinoDatos;
import datos.TerminalOrigenDatos;
import entidades.Bus;
import entidades.TerminalDestino;
import entidades.TerminalOrigen;
import java.util.List;

public class BusNegocio 
{
    private static BusNegocio instancia;
    
    public static BusNegocio getInstancia()
    {
        if(instancia == null)
            instancia = new BusNegocio();
        return instancia;
    }
    
    public int crearBus(Bus bus) throws Exception
    {
        int registrosAfectados = BusDatos.getInstancia().ingresar(bus);
        return registrosAfectados;
    }
    
    public List<TerminalOrigen> terminalOrigenes() throws Exception
    {
        List<TerminalOrigen> terminalOrigenes = TerminalOrigenDatos.getInstancia().buscar();
        return terminalOrigenes;
    }
    
    public List<TerminalDestino> terminalDestinos() throws Exception
    {
        List<TerminalDestino> terminalDestinos = TerminalDestinoDatos.getInstancia().buscar();
        return terminalDestinos;
    }
    
    public TerminalOrigen buscarTerminalOrigen(String nombre) throws Exception
    {
        TerminalOrigen terminalOrigen = TerminalOrigenDatos.getInstancia().buscar(nombre);
        return terminalOrigen;
    }
    
    public TerminalDestino buscarTerminalDestino(String nombre) throws Exception
    {
        TerminalDestino terminalDestino = TerminalDestinoDatos.getInstancia().buscar(nombre);
        return terminalDestino;
    }
    
    public Bus buscar(String codigo) throws Exception
    {
        Bus bus = BusDatos.getInstancia().buscar(codigo);
        return bus;
    }
}
