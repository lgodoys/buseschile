/** Clase Negocio para RESERVA. Se encarga de pasar los elementos
 * a la vista gráfica del programa, maneja todos los métodos
 * para que Swing pueda acceder a los datos.
 */
package negocio;

import datos.PasajeroDatos;
import datos.ReservaDatos;
import entidades.Pasaje;
import entidades.Pasajero;
import entidades.Reserva;
import java.util.List;

public class ReservaNegocio 
{
    private static ReservaNegocio instancia;
    
    public static ReservaNegocio getInstancia()
    {
        if(instancia == null)
            instancia = new ReservaNegocio();
        return instancia;
    }
    
    public int crearReserva(Reserva reserva) throws Exception
    {
        Pasaje pasaje = reserva.getPasaje();
        pasaje.setEstado(Pasaje.ESTADO_OCUPADO);
        int registrosAfectados = ReservaDatos.getInstancia().ingresar(reserva);
        return registrosAfectados;
    }
    
    public Pasajero buscarPasajero(String rut) throws Exception
    {
        Pasajero pasajero = PasajeroDatos.getInstancia().buscarPorRUT(rut);
        return pasajero;
    }
    
    public List<Reserva> listadoReservas() throws Exception
    {
        List<Reserva> reservas = ReservaDatos.getInstancia().listado();
        return reservas;
    }
}
