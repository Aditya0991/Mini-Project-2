import java.util.Scanner;

public class nesIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 100){
            System.out.println("Number is less then 100");
            if(num >= 50 && num <=100 ){
                System.out.println("Number is between 50 and 100");
            }
        }
        else{
            System.out.println("Enter the number in the range");
        }
    }
}
