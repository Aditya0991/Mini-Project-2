
public class revstring {
    public static void main(String[] args) {
        String st = "abcd";
        revst(st, st.length()-1);
    }
    public static void revst(String st , int idx){
        if(idx == 0){
            System.out.print(st.charAt(idx));
            return;
        }
        System.out.print(st.charAt(idx));
        revst(st,idx-1);
    }
    
}
