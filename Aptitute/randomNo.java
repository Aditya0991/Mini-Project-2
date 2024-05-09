import java.lang.Math;
import java.util.Scanner;
public class randomNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, guess,tries =0;
        number = (int)(Math.random()*100)+1 ;
        System.out.println("Guess My number game");
        
        do{
            System.out.println("Enter a guess between 1 and 100 : ");
            guess = sc.nextInt();
            tries++;
            if(guess > number){
                System.out.println("Too High! Try Again");
            }
            else if(guess < number){
                System.out.println("Too low ! Try Again");
            }
            else{
                System.out.println("you got it right in " + tries + "tries");
            }
        }while(guess != number );
        
        
    }
}