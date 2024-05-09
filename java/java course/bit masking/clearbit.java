import java.util.Scanner;
public class clearbit {
    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 2;
        int bitmask = 1<<pos;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the operation you want to perform 1 for clear bit and 0 to set bit");
        int opr = in.nextInt();
        if (opr == 1){//clear bit
            int out = bitmask | n;
            System.out.println(out);
        }
        else {// set bit
            int notbitmask = ~(bitmask);
            int newnum = notbitmask & n;
            System.out.println(newnum);
                        
        }
        
    }
}
