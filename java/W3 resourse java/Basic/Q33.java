import java.util.Scanner;
public class Q33 {
    public static void main(String[] args){
        int r,sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = in.nextInt();
        while(num>0){
            r = num%10;
            sum +=r;
            num = num/10;
        }

        System.out.println("Sum of digit of entered number: " + sum);
    }
}
