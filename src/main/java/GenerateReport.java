import net.sf.jasperreports.engine.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GenerateReport {
    public static void main(String[] args) throws IOException, JRException {
       // GeneratePDFReport("C:/work",GenerateReportParams.generateSumDayReport("C:/work"));
//        GeneratePDFReport(new GetPath().showURL(),GenerateReportParams.generateSumDayReport(new GetPath().showURL()));
        HashMap<String,Object> map=new HashMap<String, Object>();
        map.put("2",22);
        JasperPrint jasperPrint =JasperFillManager.fillReport("C:/work/test.jasper", map);
        String desFilePath= "C:/work/jasper/test.xml";
        JasperExportManager.exportReportToHtmlFile(jasperPrint,desFilePath);
    }

    private static void GeneratePDFReport(String path, Map<String, Object> sourceData){
        try {
            byte[] pdfStream = JasperRunManager.runReportToPdf(path + "/test.jasper", sourceData, new JREmptyDataSource());


            File file = new File(path + "/report.odt");
            FileOutputStream op = new FileOutputStream(file);
            op.write(pdfStream);
            op.flush();
            op.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JRException e) {
            e.printStackTrace();
        }
    }
}
