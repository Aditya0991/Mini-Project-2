class parts{
    String Body;
    String Motor;
    String Net;
    public void Start(){
        System.out.println("Plug the Wire");
        System.out.println("Body Type : " + Body);
        System.out.println("Motor Type: " + Motor);
        System.out.println("Net Type: " + Net);
    }
}
public class cooler{
    public static void main(String[] args){
        parts cooler1 = new parts();
        cooler1.Body = "Plastic";
        cooler1.Motor = "Three phase induction Motor";
        cooler1.Net = "Plastic Net";
        cooler1.Start();
    }
}