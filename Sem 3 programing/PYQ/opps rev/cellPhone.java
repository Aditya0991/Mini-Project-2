interface Samsung{
    void turnOn();
    void turnOff();
}
interface Nokia{
    void call();
}
public class cellPhone implements Samsung,Nokia{
    public void turnOn(){
        System.out.println("On");
    }
    public void turnOff(){
        System.out.println("off");
    }
    public void call(){
        System.out.println("Calling");
    }
    public static void main(String[] args) {
        cellPhone obj = new cellPhone();
        obj.call();
        obj.turnOff();
        obj.turnOn();
    }
}
