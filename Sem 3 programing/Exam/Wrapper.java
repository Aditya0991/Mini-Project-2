import java.*;
public class Wrapper {
    public static void main(String[] args) {
        int ip= 100;
        Integer i = Integer.valueof(ip);
        // Integer io = ip; //Autoboxing
        System.out.println(i);
    }
}
