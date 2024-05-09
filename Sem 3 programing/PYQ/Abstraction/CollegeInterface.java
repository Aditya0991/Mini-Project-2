interface Inhrastructure{
    void AB();
    void Table();
}
public class College implements Inhrastructure{
    public void AB(){
    System.out.println("10  AB");

    }    
    public void Table(){
        System.out.println("4 Table");
    }
public static void main(String[] args) {
        College c1 = new College();
        c1.AB();
        c1.Table();
    }
}
