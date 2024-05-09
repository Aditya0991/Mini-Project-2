class test{
    int i;
    void setvalue(int i){
        this.i = i;
    }
    void getvalue(){
        System.out.println(i);
    }
}
class thisKey{
    public static void main(String[] args) {
        test t = new test();
        t.setvalue(10);
        t.getvalue();
    }
}