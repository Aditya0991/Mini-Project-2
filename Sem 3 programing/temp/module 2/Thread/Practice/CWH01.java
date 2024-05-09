abstract class pen{
    abstract void write();
    abstract void refill();
}
class funtailPen extends pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Change NIB");
    }
}
public class CWH01 {
    public static void main(String[] args) {
        funtailPen f = new funtailPen();
        f.changeNib();
        f.refill();
        f.write();
    }    
}
