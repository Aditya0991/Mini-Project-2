public class MethodOverload {
    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();
        obj.main(10);
        obj.main(10,20);
    }
    public static void main(int x,int y){
        System.out.println(x + y);
    }
    public static void main(int x){
        System.out.println(x );
    }

}
