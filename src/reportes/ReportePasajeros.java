/** Gestor de reporte de Pasajeros
 * Se encarga de generar un reporte con los datos
 * que se le indican para generar un listado de
 * todos los pasajeros de un bus.
 */

package reportes;

import datos.Conexion;
import java.sql.*;
import java.util.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.*;
import net.sf.jasperreports.view.*;

public class ReportePasajeros 
{
    private final Connection cnn;
    
    public ReportePasajeros() throws SQLException
    {
        cnn = Conexion.getInstancia().miConexion();
    }
    
    public void runReportePasajeros()
    {
        try
        {
            String direccionJasPer = "src\\reportes\\ReportePasajeros.jasper";
            JasperReport masterReport = null;
            try
            {
                masterReport = (JasperReport) JRLoader.loadObjectFromFile(direccionJasPer);
            }
            catch(JRException e)
            {
                System.out.println("e: " + e.getMessage());
                System.exit(3);
            }
            Map<String, Object> parametro = new HashMap<>();
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parametro, cnn);
            JasperViewer jviewer = new JasperViewer(jasperPrint);
            jviewer.setTitle("Reportes Pasajeros");
            jviewer.setVisible(true);
        }
        catch(JRException j)
        {
            System.out.println("J: " + j.getMessage());
        }
    }
}
