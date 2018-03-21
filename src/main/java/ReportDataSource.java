import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ReportDataSource implements JRDataSource {
    private Iterator iter;
    Map map = new HashMap();
    public boolean next() throws JRException {
        return false;
    }
//    //无参的构造函数
//    public ReportDataSource(){
//
//    }

    //以sex为参数的有参构造函数，用于数据初始化
    public ReportDataSource(){
        //通过性别获取相应用户的数据
        List datas=UserReport.getList();
        //要将List中的数据迭代，需要使用Iterator迭代对象
        iter=datas.iterator();
    }


    public Object getFieldValue(JRField jrField) throws JRException {
        if(iter.hasNext()){
            map=(Map)iter.next();
            return true;
        }
        return false;
    }
}
