public class printSubsequence {
    public static void main(String[] args) {
        String str = "abc";
        String newStr = "";
        subsequenceOfString(str, 0, newStr);
    }
    public static void subsequenceOfString(String str , int idx , String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currentchar = str.charAt(idx);
        // to be in 
        subsequenceOfString(str, idx+1, newStr+ currentchar);
        // not to be in 
        subsequenceOfString(str, idx+1, newStr);
    }
}
