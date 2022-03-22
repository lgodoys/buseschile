/** Constructor de entidades para BUS. Define todos los atributos
 * que son usados más adelante en todas las clases, interfaces y
 * controladores de los datos. * 
 */

package entidades;

public class Bus 
{
    private String idbus;
    private TerminalOrigen terminalOrigen;
    private TerminalDestino terminalDestino;
    private String estado;
    private static final int CAPACIDAD = 40;
    
    public static String ESTADO_EN_RUTA = "EN RUTA";
    public static String ESTADO_DISPONIBLE = "DISPONIBLE";
    public static String ESTADO_LLENANDO = "LLENANDO";
    
    public void setIDBus(String idbus)
    {
        this.idbus = idbus;
    }
    
    public void setOrigen(TerminalOrigen origen)
    {
        this.terminalOrigen = origen;
    }
    
    public void setDestino(TerminalDestino destino)
    {
        this.terminalDestino = destino;
    }
    
    public void setEstado(String estado)
    {
        this.estado = estado;
    }
    
    public String getIDBus()
    {
        return idbus;
    }
    
    public TerminalOrigen getOrigen()
    {
        return terminalOrigen;
    }
    
    public TerminalDestino getDestino()
    {
        return terminalDestino;
    }
    
    public String getEstado()
    {
        return estado;
    }
    
    public int getAsientos()
    {
        return CAPACIDAD;
    }
}
