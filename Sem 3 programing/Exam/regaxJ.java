import java.util.regex.*;
import java.util.Scanner;
public class regaxJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        Pattern p = Pattern.compile("[8-9][1-9]*{9}");
        Matcher m = p.matcher(st);
        if(m.find()&&m.group().equals(st)){
            System.out.println("valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
