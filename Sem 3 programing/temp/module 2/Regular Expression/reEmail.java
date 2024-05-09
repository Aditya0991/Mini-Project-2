import java.util.Scanner;
import java.util.regex.*;
public class reEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Pattern p = Pattern.compile("[a-zA-Z0-9-.-_]*[@][a-zA-Z0-9]+([.][a-zA-Z]+)+");
        Matcher m = p.matcher(s);
        if(m.find() && m.group().equals(s)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
