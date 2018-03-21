import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRPdfExporterParameter;

import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class jaspertest {
    public static void main(String[] args) {
        Map parameters=new HashMap();
        ByteArrayOutputStream outPut=new ByteArrayOutputStream();
        FileOutputStream outputStream=null;
        JFileChooser fd=new JFileChooser();
        fd.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fd.showSaveDialog(null);
        File f=fd.getSelectedFile();
        System.out.println(f.getName());
        System.out.println(f.getPath()+"report.pdf");
        File file=new File(f.getPath()+"//report.pdf");
        String reportModelFile="src/scanhole.jasper";
        try {
           // JRDataSource jrDataSource=new JRBeanCollectionDataSource(UserReport.getList());
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
            String url = "jdbc:mysql://112.74.107.172:3306/vms?useUnicode=true&characterEncoding=utf-8";
            String userName = "vms";
            String password = "ingeek2018";
            Map parameterMap = new HashMap();
          //  parameterMap.put("nm", new String("9"));
            parameterMap.put("num", 10);
           Connection conn= DriverManager.getConnection(url,userName,password);
            ReportDataSource s=new ReportDataSource();
            JasperPrint jasperPrint= JasperFillManager.fillReport(reportModelFile,parameterMap,conn);
            JRAbstractExporter exporter=new JRPdfExporter();
            //创建jasperPrint
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
            //生成输出流
            exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, outPut);
            //屏蔽copy功能
            exporter.setParameter(JRPdfExporterParameter.IS_ENCRYPTED,Boolean.TRUE);
            //加密
            exporter.setParameter(JRPdfExporterParameter.IS_128_BIT_KEY,Boolean.TRUE);
            exporter.exportReport();
            outputStream=new FileOutputStream(file);
            outputStream.write(outPut.toByteArray());
        } catch (JRException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                outPut.flush();
                outPut.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
