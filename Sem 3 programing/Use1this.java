class test{
    int i;
    void setvalue(int i){
        this.i = i;
    }
    int getvalue(){
        return i;
    }
}
public class Use1this {
    public static void main(String[] args) {
        test t = new test();
        t.setvalue(10);
        
        System.out.println(t.getvalue());
    }
}
