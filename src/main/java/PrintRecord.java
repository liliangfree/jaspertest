import java.util.HashMap;
import java.util.Map;

public class PrintRecord {
    public static final int KEY_NOT_FOUND = -1;

    Map<String, Object> vals;

    public PrintRecord() {
        vals = new HashMap<String, Object>();
    }

    public void setValue(String key, Object value) {
        vals.put(key, value);
    }

    public Object getValue(String key) {
        Object val = vals.get(key);
        if (val == null)
            return "";
        else
            return val;
    }

    public int getKeyNum() {
        return vals.size();
    }
}
