class atlas{
    void paddle(){
        System.out.println("Atlas Running");
    }
}
class hero{
    void paddle(){
        System.out.println("Hero Running");
    }
}
public class MethodOverridding {
    public static void main(String[] args) {
        atlas obj1 = new atlas();
        hero obj2 = new hero();
        obj1.paddle();
        obj2.paddle();
    }
}
