import javax.print.DocFlavor.STRING;
import java.util.Scanner;
public class Q37 {
    public static void main(String[] args){
        String rev = "";
        System.out.println("Enter the string : ");
        Scanner in = new Scanner(System.in);
        String st = in.next();
        System.out.println(st);
        System.out.println("Reverse of entered string : ");
        int len = st.length();

        for(int i =len-1;i>=0;i--){
            rev+= st.charAt(i);
        }
        System.out.println(rev);

    }
    
}
