import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserReport implements Serializable {

   // private Iterator iter;
    private static final long serialVersionUID = -6213239684756951292L;
    private String name;// 姓名  
    private String sex;// 性别  
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String hometown;// 籍贯  
    private String phone;// 电话号码

   public UserReport(){}
   public UserReport(String name, String sex, int age, String hometown, String phone){
       this.name=name;
       this.sex=sex;
       this.age=age;
       this.hometown=hometown;
       this.phone=phone;
   }

    // private PersonVO userBean;
   // private PersonVO familyBean;
    public static List<UserReport> getList(){
        List<UserReport> list=new ArrayList<UserReport>();
        list.add(new UserReport("Lily","female",22,"Hubei","10086"));
        list.add(new UserReport("Macro","male",33,"Beijing","13800000000"));
        Iterator iter=list.iterator();
        return list;
    }

}
