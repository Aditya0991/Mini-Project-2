import java.util.Scanner;
public class age2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age = sc.nextInt();
        if(age >= 18 && age <50){
            System.out.println("Eligible to work");
        }
        else if(age > 50 ){
            System.out.println("You are to old to work");
        }
        else{
            System.out.println("you are Minor");
        }   
    }
}
