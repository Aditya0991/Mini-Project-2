class Emp {
    void name(){
        System.out.println(1);
    }
}
public class MehtodOverriding {
    void name(){
        System.out.println(2);
    }
    public static void main(String[] args) {
        MehtodOverriding obj = new MehtodOverriding();
        Emp obj2 = new Emp();
        obj.name();
        obj2.name();
            }
}
