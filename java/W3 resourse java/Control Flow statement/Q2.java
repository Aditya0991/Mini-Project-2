import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = in.nextInt();
        System.out.println("Enter the value of b : ");
        int b = in.nextInt();
        System.out.println("Enter the value of c : ");
        int c = in.nextInt();
        double out = Math.sqrt(Math.pow(b, 2)-4*a*c);
        double root1 = (-b+out)/2*a;
        double root2  = (-b-out)/2*a;
        System.out.println("Roots of quadratic equation are : " + root1 + "and" + root2);
    }
}
