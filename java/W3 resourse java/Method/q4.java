public class q4 {
    public static void main(String[] args) {
        
        count_vowel();
    }

    public static void count_vowel(String st ){
        int vow = 0;
        for (int i = 0; i<st.length() ;i++){
        if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' ||st.charAt(i) == 'u' || st.charAt(i) == 'A' || st.charAt(i) == 'E' || st.charAt(i) == 'I' || st.charAt(i) == 'O' ||st.charAt(i) == 'U'){
            
            vow++;
        }
    }
    System.out.println("Vowel in the entered string : " + vow);
    }
}
