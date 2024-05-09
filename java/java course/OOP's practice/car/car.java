class parts{
    String Engine;
    String Gears;
    String AC;
    public void Start(){
        System.out.println("Press the start button to start");
        System.out.printf("Enjoy %s \n" , Engine);
        System.out.printf("Discription %s %s",Gears,AC );
    }
}
public class car{
    public static void main(String[] args) {
        parts Body = new parts();
        Body.Engine = "20hp";
        Body.Gears = "5 speed Gear Box";
        Body.AC = "4 AC wents";
        Body.Start();
    }

}
