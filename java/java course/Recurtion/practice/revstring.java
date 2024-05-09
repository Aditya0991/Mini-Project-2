public class revstring {
    public static void main(String[] args) {
        String st = "Hello";
        rev(st.length()-1, st);
    }
    public static void rev(int idx , String st){
        if(idx == 0){
            System.out.print(st.charAt(idx));
            return;
        }
        System.out.print(st.charAt(idx));
        rev(idx-1, st);
    }
}
