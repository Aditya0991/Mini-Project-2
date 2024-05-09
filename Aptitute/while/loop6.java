// ENter the positive no. till negative no. is entered 
import java.util.Scanner;;
public class loop6 {
    public static void main(String[] args) {
        int sum =0 ;
        int i =0 ;
        while(i > -1){
            Scanner sc = new Scanner(System.in);
            i = sc.nextInt();
            sum+=i;
        }
        System.out.println(sum);
    }
}
