/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reports;

import java.io.File;
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
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleXlsReportConfiguration;
/**
 *
 * @author Daniel
 */
public class ReportGenerator {
    
    public void reporteParametrizado(String fechaIni, String fechaFin, String reportType){
        try {
            JasperReport reporte= (JasperReport) JRLoader.loadObjectFromFile(ReportGenerator.class.getResource("/reports/"+reportType+".jasper").getFile());
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
    public void reporteParametrizadoUnico(String fecha, String reportType){
        try {
            String ruta= ReportGenerator.class.getResource("/reports/"+reportType+".jasper").getFile();
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
    public void reporteParametrizadoUnicoPDF(String fecha, String reportType){
        try {
            String ruta= ReportGenerator.class.getResource("/reports/"+reportType+".jasper").getFile();
            JasperReport reporte= (JasperReport) JRLoader.loadObjectFromFile(ruta);
            HashMap parametros = new HashMap();            
            parametros.put("Fecha_Inicial",fecha);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
            JasperPrint j = JasperFillManager.fillReport(reporte, parametros, con);
            String filePath = new File("").getAbsolutePath();
            filePath = filePath.concat("\\src\\reports/");
            JasperExportManager.exportReportToPdfFile(j,filePath+reportType+".pdf");            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar el reporte"+e);
        }
    }
    public void reporteParametrizadoPDF(String fechaIni,String fechaFin, String reportType){
        try {
            JasperReport reporte= (JasperReport) JRLoader.loadObjectFromFile(ReportGenerator.class.getResource("/reports/"+reportType+".jasper").getFile());
            HashMap parametros = new HashMap();
            parametros.put("Fecha_Inicial",fechaIni);
            parametros.put("Fecha_Final",fechaFin);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
            JasperPrint j = JasperFillManager.fillReport(reporte, parametros, con);
            String filePath = new File("").getAbsolutePath();
            filePath = filePath.concat("\\src\\reports/");
            JasperExportManager.exportReportToPdfFile(j,filePath +reportType+".pdf");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar el reporte"+e);
        }
    }
    public void reporteParametrizadoUnicoXLS(String fecha, String reportType){
        try {
            String ruta= ReportGenerator.class.getResource("/reports/"+reportType+".jasper").getFile();
            JasperReport reporte= (JasperReport) JRLoader.loadObjectFromFile(ruta);
            HashMap parametros = new HashMap();            
            parametros.put("Fecha_Inicial",fecha);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
            JasperPrint j = JasperFillManager.fillReport(reporte, parametros, con);
            String filePath = new File("").getAbsolutePath();
            filePath = filePath.concat("\\src\\reports/");
            JasperExportManager.exportReportToPdfFile(j,filePath +reportType+".xls");
            JRXlsExporter exporter = new JRXlsExporter();
            exporter.setExporterInput(new SimpleExporterInput(j));
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(filePath));
            SimpleXlsReportConfiguration configuration = new SimpleXlsReportConfiguration();
            configuration.setOnePagePerSheet(true);
            configuration.setDetectCellType(true);
            configuration.setCollapseRowSpan(false);
            exporter.setConfiguration(configuration);

            exporter.exportReport();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar el reporte"+e);
        }
    }
    public void reporteParametrizadoXLS(String fechaIni,String fechaFin, String reportType){
        try {
            JasperReport reporte= (JasperReport) JRLoader.loadObjectFromFile(ReportGenerator.class.getResource("/reports/"+reportType+".jasper").getFile());
            HashMap parametros = new HashMap();
            parametros.put("Fecha_Inicial",fechaIni);
            parametros.put("Fecha_Final",fechaFin);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
            JasperPrint j = JasperFillManager.fillReport(reporte, parametros, con);
            String filePath = new File("").getAbsolutePath();
            filePath = filePath.concat("\\src\\reports/");
            JasperExportManager.exportReportToPdfFile(j,filePath +reportType+".xls");
            JRXlsExporter exporter = new JRXlsExporter();
            exporter.setExporterInput(new SimpleExporterInput(j));
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(filePath));
            SimpleXlsReportConfiguration configuration = new SimpleXlsReportConfiguration();
            configuration.setOnePagePerSheet(true);
            configuration.setDetectCellType(true);
            configuration.setCollapseRowSpan(false);
            exporter.setConfiguration(configuration);

            exporter.exportReport();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar el reporte"+e);
        }
    }
    
}
