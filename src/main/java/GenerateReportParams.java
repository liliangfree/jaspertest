import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GenerateReportParams {
    public static Map<String, Object> generateSumDayReport(String path) {
        HashMap<String, Object> params = new HashMap<String, Object>();

        params.put("fromDate", "2015/06/08");
        params.put("toDate", "2015/06/09");
        params.put("presentmentDate", "2015/06/09");
        params.put("clearingDate", "2015/06/09");

        List<DailyReportSumDayDTO> beanList1 = GenerateBeans.getDailyReportSumDay();
        List<PrintRecord> prs1 = new LinkedList<PrintRecord>();

        BigDecimal totalPresented1 = BigDecimal.ZERO;
        BigDecimal totalPending1 = BigDecimal.ZERO;
        BigDecimal totalAccepted1 = BigDecimal.ZERO;
        BigDecimal totalRejected1 = BigDecimal.ZERO;
        BigDecimal totalError1 = BigDecimal.ZERO;

        for(DailyReportSumDayDTO dto : beanList1){
            PrintRecord pr = new PrintRecord();
            pr.setValue("channel", dto.getChannel());
            pr.setValue("customerGroup", dto.getCustomerGroup());
            pr.setValue("presented", dto.getPresented());
            pr.setValue("pending", dto.getPending());
            pr.setValue("accepted", dto.getAccepted());
            pr.setValue("rejected", dto.getRejected());
            pr.setValue("error", dto.getError());

            totalPresented1 = dto.getPresented().add(totalPresented1);
            totalPending1 = dto.getPending().add(totalPending1);
            totalAccepted1 = dto.getAccepted().add(totalAccepted1);
            totalRejected1 = dto.getRejected().add(totalRejected1);
            totalError1 = dto.getError().add(totalError1);

            prs1.add(pr);
        }

        params.put("totalPresented1", totalPresented1);
        params.put("totalPending1", totalPending1);
        params.put("totalAccepted1", totalAccepted1);
        params.put("totalRejected1", totalRejected1);
        params.put("totalError1", totalError1);
        params.put("DataSource1", new GenericDataSource(prs1));

        List<DailyReportSumDayDTO> beanList2 = GenerateBeans.getProductTypeSumDay();
        List<PrintRecord> prs2 = new LinkedList<PrintRecord>();

        BigDecimal totalPresented2 = BigDecimal.ZERO;
        BigDecimal totalPending2 = BigDecimal.ZERO;
        BigDecimal totalAccepted2 = BigDecimal.ZERO;
        BigDecimal totalRejected2 = BigDecimal.ZERO;
        BigDecimal totalError2 = BigDecimal.ZERO;

        for(DailyReportSumDayDTO dto : beanList2){
            PrintRecord pr = new PrintRecord();
            pr.setValue("productType", dto.getProductType());
            pr.setValue("presented", dto.getPresented());
            pr.setValue("pending", dto.getPending());
            pr.setValue("accepted", dto.getAccepted());
            pr.setValue("rejected", dto.getRejected());
            pr.setValue("error", dto.getError());

            totalPresented2 = dto.getPresented().add(totalPresented2);
            totalPending2 = dto.getPending().add(totalPending2);
            totalAccepted2 = dto.getAccepted().add(totalAccepted2);
            totalRejected2 = dto.getRejected().add(totalRejected2);
            totalError2 = dto.getError().add(totalError2);

            prs2.add(pr);
        }

        params.put("totalPresented2", totalPresented2);
        params.put("totalPending2", totalPending2);
        params.put("totalAccepted2", totalAccepted2);
        params.put("totalRejected2", totalRejected2);
        params.put("totalError2", totalError2);
        params.put("DataSource2", new GenericDataSource(prs2));
        params.put("SUBREPORT_DIR", path);

        return params;
    }
}
