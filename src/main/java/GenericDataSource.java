import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import net.sf.jasperreports.engine.JRRewindableDataSource;

import java.util.List;

public class GenericDataSource implements JRRewindableDataSource {
    int index;
    List<PrintRecord> records;

    public GenericDataSource(List<PrintRecord> records) {
        this.records = records;
        this.index = -1;
    }

    public Object getFieldValue(JRField jrField) throws JRException {
        String fieldName = jrField.getName();
        return records.get(index).getValue(fieldName);
    }

    public boolean next() throws JRException {
        ++index;
        return index < records.size();
    }

    public void moveFirst() throws JRException {

    }
}
