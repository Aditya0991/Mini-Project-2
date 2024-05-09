public class removeDuplicate {
    public static void main(String[] args) {
        String st = "hello";
        String n_st = "";
        stringwithdup(st, 0, n_st);
    }
    public static void stringwithdup(String st , int idx , String n_st){
        if(idx == st.length()-1){
            System.out.println(n_st);
            return;
        }
        if(st.charAt(idx) != n_st.charAt(idx)){
            n_st += st.charAt(idx);
        }
        stringwithdup(st, idx+1, n_st);
    }
}
