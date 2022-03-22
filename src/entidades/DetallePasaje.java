/** Constructor de entidades para DETALLEPASAJE. Define todos los atributos
 * que son usados más adelante en todas las clases, interfaces y
 * controladores de los datos. 
 */

package entidades;

public class DetallePasaje 
{
    private Pasaje pasaje;
    private Reserva reserva;
    private int cantidad;
    
    public void setPasaje(Pasaje pasaje)
    {
        this.pasaje = pasaje;
    }
    
    public void setReserva(Reserva reserva)
    {
        this.reserva = reserva;
    }
    
    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }
    
    public Pasaje getPasaje()
    {
        return pasaje;
    }
        
    public Reserva getReserva()
    {
        return reserva;
    }
    
    public int getCantidad()
    {
        return cantidad;
    }
    
    
}
