/** Constructor de entidades para RESERVA. Define todos los atributos
 * que son usados más adelante en todas las clases, interfaces y
 * controladores de los datos. * 
 */

package entidades;

import java.sql.Date;

public class Reserva 
{
    private String idReserva;
    private Date fechaReserva;
    private Pasajero pasajero;
    private Pasaje pasaje;
    private double precioReserva;
    private boolean isPagado;
    private boolean isVencido;
    
    public void setIDReserva(String idReserva)
    {
        this.idReserva = idReserva;
    }
    
    public void setFechaReserva(Date fechaReserva)
    {
        this.fechaReserva = fechaReserva;
    }
    
    public void setPasajero(Pasajero pasajero)
    {
        this.pasajero = pasajero;
    }
    
    public void setPasaje(Pasaje pasaje)
    {
        this.pasaje = pasaje;
    }
    
    public void setPrecioReserva(double precioReserva)
    {
        this.precioReserva = precioReserva;
    }
    
    public void setPagado(boolean isPagado)
    {
        this.isPagado = isPagado;
    }
    
    public void setVencido(boolean isVencido)
    {
        this.isVencido = isVencido;
    }
    
    public String getIDReserva()
    {
        return idReserva;
    }
    
    public Date getFechaReserva()
    {
        return fechaReserva;
    }
    
    public Pasajero getPasajero()
    {
        return pasajero;
    }
    
    public Pasaje getPasaje()
    {
        return pasaje;
    }
    
    public double getPrecioReserva()
    {
        return precioReserva;
    }
    
    public boolean getPagado()
    {
        return isPagado;
    }
    
    public boolean getVencido()
    {
        return isVencido;
    }
}