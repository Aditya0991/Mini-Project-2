interface BiCycle{
    int a = 10;
    abstract void speedup();
    abstract void pressbreak(); 
}
public class BicycleInteface implements BiCycle{
   public void speedup(){
        System.out.println("Max speed 35");
    }
   public void pressbreak(){
        System.out.println("Break applied");
    }
    public static void main(String[] args) {
        BicycleInteface obj = new BicycleInteface();
        obj.speedup();;
        obj.pressbreak();
        System.out.println(obj.a);
    }
}
