public class methodOrerloading {
    static final int add(int a, int b, int c){
       return a+b+c;
    }
    int add(int a , int b){
        return a+b;
    }
    public static void main(String[] args) {
        methodOrerloading obj = new methodOrerloading();
        System.out.println(obj.add(1, 2));
        System.out.println(add(1, 2,3));
        System.out.println(add(1, 1,1));
    }
}
