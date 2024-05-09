public class q3 {
    public static void main(String[] args) {
        String st =  "abcde";
        int idx = 1;
        System.out.println(st.codePointAt(idx-1)); 
            //Both things are same.   
        System.out.println(st.codePointBefore(idx));  
        
    }
}
