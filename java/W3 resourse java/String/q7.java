public class q7 {
    public static void main(String[] args) {
        String str = "This is a ";
        String str1 = "JAVA code";
        // Method 01
        // str += str1;
        // System.out.println(str);
        // Method 02
        String str3 = str.concat(str1);
        System.out.println(str3);
        
    }
}
