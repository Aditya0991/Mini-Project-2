class Employee{
    private int id;
    private String Name;
    public Employee(){
        id = 1213;
        Name = "Aditya";
    }
    public String getname() {return Name;}
    public void setname(String st){Name = st;} 
    public void setid(int i){id = i;}
    public int getid(){return id;}
}


public class constructor {
    public static void main(String[] args){
       Employee Emp1 = new Employee();
        // Emp1.setname("Anu");
        // Emp1.setid(41414);
        System.out.println(Emp1.getname());
        System.out.println(Emp1.getid());
    }
}
