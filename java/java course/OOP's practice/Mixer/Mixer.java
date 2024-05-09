class Accessories{
    String Jars;
    String Jucier;
    String Mixer;
    String PotatoCutter;
    public void FunctionOfAccessories() {
        System.out.println("jars : " + Jars);
        System.out.println("Jucier : " + Jucier);
        System.out.println("Mixer : " + Mixer);
        System.out.println("Potato : " + PotatoCutter);
    }
}
public class Mixer{
    public static void main(String[] args) {
        Accessories MulpurposeMixer = new Accessories();
        MulpurposeMixer.Jars = "4 size of jars for Various uses";
        MulpurposeMixer.Jucier = "Fit jucier blade No. 2 ";
        MulpurposeMixer.Mixer = "It can be use for varios purposes like mixing of power and to mesh atta and make its dough";
        MulpurposeMixer.PotatoCutter = "This of used for Making Potato chips";
        MulpurposeMixer.FunctionOfAccessories();
    }
}