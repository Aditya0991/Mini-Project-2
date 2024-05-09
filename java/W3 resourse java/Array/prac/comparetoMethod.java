public class comparetoMethod {
    public static void main(String[] args) {
        String st1 = "First String";
        String st2 = "First StrIng";
        System.out.println(st1.compareToIgnoreCase(st2));
        System.out.println(st1.compareTo(st2));
    }
}
