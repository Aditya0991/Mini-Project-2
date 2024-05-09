public class printSubsequenceOfString {
    // MOST IMPORTANT
    public static void main(String[] args) {
        String str = "abc";
        String newStr = "";
        printSubSeq(str, 0, newStr);
    }
    public static void printSubSeq(String str , int idx ,String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currentchar = str.charAt(idx);
        // to be in 

        printSubSeq(str, idx+1 ,newStr+currentchar);
        // not to be in 
        printSubSeq(str, idx+1 , newStr);
    }
}
