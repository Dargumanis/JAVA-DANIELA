/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reports;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import utils.Constants;

import net.sf.jasperreports.engine.JREmptyDataSource;
/**
 *
 * @author Daniel
 */
public class ReportGenerator {
    public void reporteBundles(String fecha){
        try {
            String ruta= ReportGenerator.class.getResource("/reports/BundleReport.jasper").getFile();
            JasperReport reporte= (JasperReport) JRLoader.loadObjectFromFile(ruta);
            HashMap parametros = new HashMap();            
            parametros.put("Fecha_Inicial",fecha);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
            JasperPrint j = JasperFillManager.fillReport(reporte, parametros, con);
            JasperViewer jv = new JasperViewer(j,false);
            jv.setTitle("Reporte Bundles");
            jv.setVisible(true); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar el reporte"+e);
        }
    }
    
    public void reporteVentas(String fechaIni, String fechaFin){
        try {
            JasperReport reporte= (JasperReport) JRLoader.loadObjectFromFile(ReportGenerator.class.getResource("/reports/SalesReport.jasper").getFile());
            HashMap parametros = new HashMap();            
            parametros.put("Fecha_Inicial",fechaIni);
            parametros.put("Fecha_Final",fechaFin);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
            JasperPrint j = JasperFillManager.fillReport(reporte, parametros, con);
            JasperViewer jv = new JasperViewer(j,false);
            jv.setTitle("Reporte Ventas");
            jv.setVisible(true); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar el reporte"+e);
        }
    }
    public void reporteCostos(String fechaIni, String fechaFin){
        try {
            JasperReport reporte= (JasperReport) JRLoader.loadObjectFromFile(ReportGenerator.class.getResource("/reports/ExpensesReport.jasper").getFile());
            HashMap parametros = new HashMap();            
            parametros.put("Fecha_Inicial",fechaIni);
            parametros.put("Fecha_Final",fechaFin);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
            JasperPrint j = JasperFillManager.fillReport(reporte, parametros, con);
            JasperViewer jv = new JasperViewer(j,false);
            jv.setTitle("Reporte Costos");
            jv.setVisible(true); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar el reporte"+e);
        }
    }
    
    public void reporteCompras(String fechaIni, String fechaFin){
        try {
            JasperReport reporte= (JasperReport) JRLoader.loadObjectFromFile(ReportGenerator.class.getResource("/reports/SuppliesReport.jasper").getFile());
            HashMap parametros = new HashMap();            
            parametros.put("Fecha_Inicial",fechaIni);
            parametros.put("Fecha_Final",fechaFin);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
            JasperPrint j = JasperFillManager.fillReport(reporte, parametros, con);
            JasperViewer jv = new JasperViewer(j,false);
            jv.setTitle("Reporte Compras");
            jv.setVisible(true); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar el reporte"+e);
        }
    }
}
