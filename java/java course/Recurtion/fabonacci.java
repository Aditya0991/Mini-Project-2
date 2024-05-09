import java.util.Scanner;
public class fabonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the term in series : ");
        int term = in.nextInt();
        System.out.print(a + " ");
        System.out.print(b + " ");
        printFabonacciSeries(a, b, term-2, 0);
    }
    public static void printFabonacciSeries(int a,int b, int term , int idx){
        if(idx == term){
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        printFabonacciSeries(b, c, term, idx+1);
    }
}
