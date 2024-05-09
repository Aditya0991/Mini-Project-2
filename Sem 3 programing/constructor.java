public class constructor{
    int a;
    String st;
    constructor(String st ){
        System.out.println(st);
    }
    public static void main(String[] args) {
        constructor c = new constructor("abc" );
        c.constructor();
        System.out.println(c.a);
        System.out.println(c.st);
    }
}