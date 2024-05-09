class Employee {
    int emp_id;
    public void setEmpId(int emp_id1){
        emp_id =emp_id1; 
    }
    public int getEmpId(){
        return emp_id;
    }
}
class company{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpId(1);
        System.out.println(e.emp_id);
    }
}
