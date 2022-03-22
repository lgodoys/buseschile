/** Constructor de entidades para PASAJE. Define todos los atributos
 * que son usados más adelante en todas las clases, interfaces y
 * controladores de los datos. * 
 */

package entidades;

import java.sql.Date;

public class Pasaje
{
    private String idPasaje;
    private String horaViaje;
    private Date fechaViaje;
    private int asientoPax;
    private Bus bus;
    private String estado;
    private String idPasajero;
    private double precioPasaje;
    
    public final static String ESTADO_LIBRE = "Disponible";
    public final static String ESTADO_OCUPADO = "Ocupado";
    
    public void setIDPasaje(String idPasaje)
    {
        this.idPasaje = idPasaje;
    }
    
    public void setHoraViaje(String horaViaje)
    {
        this.horaViaje = horaViaje;
    }
    
    public void setFechaViaje(Date fechaViaje)
    {
        this.fechaViaje = fechaViaje;
    }
    
    public void setAsientoPax(int asientoPax)
    {
        this.asientoPax = asientoPax;
    }
    
    public void setBus(Bus bus)
    {
        this.bus = bus;
    }
    
    public void setEstado(String estado)
    {
        this.estado = estado;
    }
    
    public void setIDPasajero(String idPasajero)
    {
        this.idPasajero = idPasajero;
    }
    
    public void setPrecioPasaje(double precioPasaje)
    {
        this.precioPasaje = precioPasaje;
    }
    
    public String getIDPasaje()
    {
        return idPasaje;
    }
    
    public String getHoraViaje()
    {
        return horaViaje;
    }
    
    public Date getFechaViaje()
    {
        return fechaViaje;
    }
    
    public int getAsientoPax()
    {
        return asientoPax;
    }
    
    public Bus getBus()
    {
        return bus;
    }
    
    public String getEstado()
    {
        return estado;
    }
    
    public String getIDPasajero()
    {
        return idPasajero;
    }
    
    public double getPrecioPasaje()
    {
        return precioPasaje;
    }
}