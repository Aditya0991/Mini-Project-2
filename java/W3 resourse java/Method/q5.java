public class q5 {
    public static void main(String[] args) {
        countWords("this is a java code");
    }

    public static void countWords(String st ){
        int space = 0;
        for (int i = 0 ;i<st.length() ; i++){
            if (st.charAt(i) == ' '){
                space++;
            }
        }
        space = space + 1;
        System.out.println("Words in the entered string : " + space);
    }
}
