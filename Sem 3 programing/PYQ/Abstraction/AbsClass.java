
abstract class thisClass{
    abstract void run();
    abstract void breaks();
}
public class AbsClass extends thisClass{
    void run(){
        System.out.println("Run");
    }
    void breaks(){
        System.out.println("Break");
    }
    public static void main(String[] args) {
        AbsClass o1 = new AbsClass();
        o1.run();
    }
}
