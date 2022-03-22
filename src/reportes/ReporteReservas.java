/** Gestor de reporte de reservas.
 * Genera un reporte de todas las reservas según 
 * los parámetros que se le indiquen
 */

package reportes;

import datos.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ReporteReservas 
{
    private final Connection cnn;
    
    public ReporteReservas() throws SQLException
    {
        cnn = Conexion.getInstancia().miConexion();
    }
    
    public void runReporteReservas(String idReserva)
    {
        try
        {
            String direccionJasPer = "src\\reportes\\Reserva.jasper";
            JasperReport masterReport = null;
            try
            {
                masterReport = (JasperReport) JRLoader.loadObjectFromFile(direccionJasPer);
            }
            catch (JRException e)
            {
                System.out.println("e: "+e.getMessage());
                System.exit(3);
            }
            Map<String, Object> parametro = new HashMap<>();
            parametro.put("id", idReserva);
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parametro, cnn);
            JasperViewer jviewer = new JasperViewer(jasperPrint);
            jviewer.setTitle("Reporte de reserva de pasajes");
            jviewer.setVisible(true);
        }
        catch (JRException j)
        {
            System.out.println("J: "+j.getMessage());
        }
    }
}
