import java.security.Principal;

import javax.print.attribute.standard.MediaSize.NA;

class Employee{
    private int id;
    private String Name;
    public void setid(int n){
        id = n;
    }
    public int getid(){
        return id;
    }
    public void setname(String st){
        Name = st;
    }
    public String getname(){
        return Name;
    }
}
public class access {
    public static void main(String[] args){
        Employee Emp1 = new Employee();
        Emp1.setid(1234);
        System.out.println(Emp1.getid());
        Emp1.setname("Aditya");
        System.out.println(Emp1.getname());
    }
}
