
public class findFirstLastocc {
    public static int first = -1;
    public static int last = -1;
    public static void main(String[] args) {
        String st = "abcadcca";
        FindOccurance(0, st,'a');
    }
    public static void FindOccurance(int idx , String st , char element){
        if(idx == st.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = st.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        FindOccurance(idx+1, st, element);
    }
}
