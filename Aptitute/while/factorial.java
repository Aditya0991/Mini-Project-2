// Print factorial using while loop.
public class factorial {
    public static void main(String[] args) {
        int num = 10;
    int fac = 1 ;
    while (num  > 0){
        fac  *= num;
        num--;
    }
    System.out.println(fac);
    }
    
}
