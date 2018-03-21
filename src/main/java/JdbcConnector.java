import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnector {

    public  static Connection getConnection(){
        try {
            String url="jdbc:mysql://112.74.107.172:3306/vms";
//            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conn= DriverManager.getConnection(url,"vms","ingeek2018");
            return conn;
        }
        catch(Exception e){
            e. printStackTrace();
        }
    return null;
    }
}
