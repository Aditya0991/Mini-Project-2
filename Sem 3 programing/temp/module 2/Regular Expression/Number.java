import java.util.regex.*;
import java.util.Scanner;
class Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Pattern p = Pattern.compile("[7-9][0-9]{9}");
        Matcher m = p.matcher(s);
        if(m.find()&&m.group().equals(s)){
            System.out.println("valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}