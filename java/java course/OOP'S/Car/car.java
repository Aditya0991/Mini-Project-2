class parts{
    String Engine;
    String AC;
    int lights;

    public void start(){
        System.out.println("Press the start button");
        System.out.println("Enjoy with " + Engine + " Hp");
    }
}


public class car{
    public static void main(String[] args){
        parts Body = new parts();
        Body.Engine = "2000CC";
        Body.AC = "Four";
        Body.lights = 8;
        Body.start();
    }
}