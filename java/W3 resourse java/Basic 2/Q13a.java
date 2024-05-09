import java.util.Scanner;
public class Q13a {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int len = in.nextInt();
        System.out.print("Enter the breath: ");
        int bre = in.nextInt();
        System.out.println("Area of rectangle : "+ len*bre);
        System.out.println("Perimeter of rectangle: " + 2*(len+bre));
    }
    
}
