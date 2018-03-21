import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRJpaDataSource;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.engine.query.JRJpaQueryExecuter;
import net.sf.jasperreports.export.ExporterInput;
import net.sf.jasperreports.export.OutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;

import java.util.HashMap;

public class jasperTest {
    public static void main(String[] args){
        //设置jasper报表路径
        String reportPath="./src/basicholereport.jasper";
        //2.设定报表的外部参数，map集合，这里要注意map的key值一定要与模板里Parameters的名字一致
        HashMap<String,Object> map=new HashMap<String, Object>();
        map.put("name", "王小明");
        map.put("id", "2017022301");
        map.put("rank", "32");
        map.put("yuwen", "81");
        map.put("shuxue", "102");
        map.put("yingyu", "123");
        map.put("shengwu", "67");
        map.put("wuli", "75");
        map.put("huaxue", "86");
        map.put("rank1", "21");


        try {
            //填充报表，填充成功后会生成一个JasperPring文件，该文件用于输出
            JasperPrint jasperPrint
                    =JasperFillManager.fillReport(reportPath, map,
                    new JREmptyDataSource());
            //设定输出文件地址
            String desFilePath = "./src/JasperSampleTest.html";
            //通过JasperExportManager管理工具进行报表输出文档，此处设定为输出Html文件.
            JasperExportManager.exportReportToHtmlFile(jasperPrint,desFilePath);
            //pdf
            JasperExportManager.exportReportToPdfFile(jasperPrint,"./src/Simple_Blue.pdf");
            //xml
            JasperExportManager.exportReportToXmlFile(jasperPrint,"./src/JasperSampleTest.xml",true);
                    //(jasperPrint,"./src/JasperSampleTest.pdf");
            //exl导出
            JRXlsxExporter exlexporter = new JRXlsxExporter();
            ExporterInput exporterInput = new SimpleExporterInput(jasperPrint);
            exlexporter.setExporterInput(exporterInput);


            //设置输出项
            OutputStreamExporterOutput exporterOutput = new SimpleOutputStreamExporterOutput("./src/JasperSampleTest.xlsx");
            exlexporter.setExporterOutput(exporterOutput);
            exlexporter.exportReport();
            //word导出
            JRDocxExporter docexporter =new JRDocxExporter();
            ExporterInput exporterInput1 = new SimpleExporterInput(jasperPrint);
            docexporter.setExporterInput(exporterInput1);


            //设置输出项
            OutputStreamExporterOutput exporterOutput1 = new SimpleOutputStreamExporterOutput("./src/Simple_Blue.docx");
            docexporter.setExporterOutput(exporterOutput1);
            docexporter.exportReport();

        } catch (JRException e) {
            e.printStackTrace();
        }
    }
}
