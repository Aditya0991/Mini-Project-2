class Gpen{
    String type;
    String color;
    String company;

    public void write(){
        System.out.println("Write Something");
    }

    public void printcolor(){
        System.out.println(this.color);
    }
}
public class pen{
    public static void main(String[] args){
        Gpen pen1 = new Gpen();
        pen1.color = "Blue";
        pen1.type = "Gel";
        pen1.company = "Renolts";
        pen1.write();

        Gpen pen2 = new Gpen();
        pen2.color = "Black";
        pen2.type = "ball";
        pen2.company = "Rorito";

        pen1.printcolor();
        pen2.printcolor();
    }
}