import java.util.Scanner;
public class looprevnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    int rem = 0;
    int rev = 0;
    while(i > 0){
        rem = i % 10 ;
        rev = rev*10 + rem;
        i = i/10;

    }
    System.out.println(rev);
    }
    

}

