class Encapsulation {
    private int empId;
    public void setempId(int id){
        this.empId = id;
    }
    public void getempId(){
        System.out.println(this.empId);
    }
    public static void main(String[] args) {
        Encapsulation e1 = new Encapsulation();
        e1.setempId(5);
        e1.getempId();
    }
}
