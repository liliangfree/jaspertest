import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GenerateBeans {
    public static List<DailyReportSumDayDTO> getDailyReportSumDay(){

        List<DailyReportSumDayDTO> list = new ArrayList<DailyReportSumDayDTO>();

        list.add(new DailyReportSumDayDTO("iBanking", "Personal", BigDecimal.valueOf(8888888.99), BigDecimal.valueOf(3333333.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99),BigDecimal.valueOf(9999999.99), ""));
        list.add(new DailyReportSumDayDTO("iBanking", "Business Banking", BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99),BigDecimal.valueOf(9999999.99), ""));
        list.add(new DailyReportSumDayDTO("iBanking", "Corporate", BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99),BigDecimal.valueOf(9999999.99), ""));
        list.add(new DailyReportSumDayDTO("FCDB", "Personal", BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99),BigDecimal.valueOf(9999999.99), ""));
        list.add(new DailyReportSumDayDTO("FCDB", "Business Banking", BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99),BigDecimal.valueOf(9999999.99), ""));
        list.add(new DailyReportSumDayDTO("FCDB", "Corporate", BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99),BigDecimal.valueOf(9999999.99), ""));
        list.add(new DailyReportSumDayDTO("Corporate website", "Personal", BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(6666666.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99),BigDecimal.valueOf(9999999.99), ""));
        list.add(new DailyReportSumDayDTO("Corporate website", "Business Banking", BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99),BigDecimal.valueOf(9999999.99), ""));
        list.add(new DailyReportSumDayDTO("Corporate website", "Corporate", BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99),BigDecimal.valueOf(9999999.99), ""));
        list.add(new DailyReportSumDayDTO("HKICL portal", "Personal", BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99),BigDecimal.valueOf(9999999.99), ""));
        list.add(new DailyReportSumDayDTO("HKICL portal", "Business Banking", BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99),BigDecimal.valueOf(9999999.99), ""));
        list.add(new DailyReportSumDayDTO("HKICL portal", "Corporate", BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99),BigDecimal.valueOf(9999999.99), ""));

        return list;
    }

    public static List<DailyReportSumDayDTO> getProductTypeSumDay(){

        List<DailyReportSumDayDTO> list = new ArrayList<DailyReportSumDayDTO>();

        list.add(new DailyReportSumDayDTO("", "", BigDecimal.valueOf(6666666.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99),BigDecimal.valueOf(9999999.99), "CASA"));
        list.add(new DailyReportSumDayDTO("", "", BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99),BigDecimal.valueOf(9999999.99), "Credit Card"));
        list.add(new DailyReportSumDayDTO("", "", BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99),BigDecimal.valueOf(9999999.99), "Loans"));
        list.add(new DailyReportSumDayDTO("", "", BigDecimal.valueOf(5555555.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99), BigDecimal.valueOf(9999999.99),BigDecimal.valueOf(9999999.99), "Insurance"));

        return list;
    }
}
