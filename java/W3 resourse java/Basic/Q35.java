import javax.print.DocFlavor.STRING;
import java.util.Scanner;
public class Q35 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n-sides : ");
        int n = in.nextInt();
        System.out.println("Enter the length of side: ");
        int s = in.nextInt();
        double area = (n*Math.pow(s,2))/(4*Math.tan(Math.PI/n));
        System.out.println("Area of n sided polygon : " + area);
    }
}
