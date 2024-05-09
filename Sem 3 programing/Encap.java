public class Encap {
    private int EmpId;
    public void setEmpId(int empId){
        EmpId = empId;
    }
    public int getEmpId(){
        return EmpId;
    }
    public static void main(String[] args) {
        Encap E1 = new Encap();
        E1.setEmpId(1234); 
        System.out.println(E1.getEmpId());
    }
}
