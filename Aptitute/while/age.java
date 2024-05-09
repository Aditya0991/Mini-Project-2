import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age :");
        int age = sc.nextInt();
        System.out.println("Enter the weight :");
        int weight = sc.nextInt();
        if(age > 18){
            if(weight >= 50){
                System.out.println("Eligible to donate blood");
            }
            else{
                System.out.println("Not Eligible to donate blood");
            }
        }
        else if(age <= 18 ){
            System.out.println("Age must be greater then 18");
        }
    }
}
