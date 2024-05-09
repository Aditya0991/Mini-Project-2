import java.util.Scanner;
public class Q34 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the no. of sides : ");
        int s = in.nextInt();
        double area = (6 * Math.pow(s,2))/(4*Math.tan(Math.PI/6));
        System.out.println("Area of hexagon : " + area);
    }

}
