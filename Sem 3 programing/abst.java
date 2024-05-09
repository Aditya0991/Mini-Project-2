abstract class vehicle{
    abstract void start();
}
public class abst extends vehicle{
    void start(){
        System.out.println("Press the start button");
    }
    public static void main(String[] args) {
        abst obj = new abst();
        obj.start();
        
    }
}