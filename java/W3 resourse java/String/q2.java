// import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        // Scanner in = new Scanner(System.in);
        // String st = in.nextLine();
        String st = "abcdef";
        int ascii = st.charAt(4);
        System.out.println(ascii);
        int val2 = st.codePointBefore(4);
        System.out.println(val2);
    }
}
