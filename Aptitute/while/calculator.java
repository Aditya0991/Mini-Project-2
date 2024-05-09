import java.util.Scanner;
class calculator{
    public static void main(String[] args) {
        
        System.out.println("Enter value of a :");
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.println("Enter the operator 1->+ ,2->-,3->*,4->/,5->%: ");
        int c = sc.nextInt();
        if(c == 1){
            System.out.println("Sum = " +(a+b));
        }
        else if(c == 2){
            System.out.println("Difference = " + (a-b));
        }
        else if(c == 3){
            System.out.println("Multipuly = " + (a*b));
        }
        else if(c == 4){
            System.out.println("Divide = " + (a/b));
        }
        else if(c == 5){
            System.out.println("Modulus = " + (a%b));
        }
    }
}