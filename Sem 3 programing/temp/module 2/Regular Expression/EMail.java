import java.util.regex.*;
import java.util.Scanner;
class EMail
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
Pattern p=Pattern.compile("[a-zA-Z0-9_\-\]+[@][a-z]+[\][a-z]{2,3}");
Matcher m = p.matcher(s);
if(m.find()&&m.group().equals(s))//   
{
System.out.println("valid mail id");
}
else
{
System.out.println("invalid mail id");
}
}
}