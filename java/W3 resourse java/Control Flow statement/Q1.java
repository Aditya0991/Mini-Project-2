import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class Q1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num>0)
            System.out.println("Positive");
        else if (num<0)
            System.out.println("Negative");
        else if (num ==0)
            System.out.println("Zero");
    }
}
