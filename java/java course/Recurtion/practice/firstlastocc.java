public class firstlastocc {
    public static int First = -1;
    public static int Last = -1;
    public static void main(String[] args) {
        String st = "abacdabc";
        printFirstLastOcc(0, st, 'a');
    }
    public static void printFirstLastOcc(int idx , String st, char element){
        if(idx == st.length()){
            System.out.println(First);
            System.out.println(Last);
            return;
        }
        char currentchar = st.charAt(idx);
        if(element == currentchar){
            if(First == -1){
                First = idx;
            }
            else{
                Last = idx;
            }
        }
        printFirstLastOcc(idx+1, st, element);
    }

}
