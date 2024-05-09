public class reverseString {
    public static void main(String[] args) {
        String str = "";
        int idx = str.length()-1;
        String newStr = "";
        printRevStr(str, idx , newStr);
    }
    public static void printRevStr(String str , int idx , String newStr){
        if(idx == 0){
            newStr += str.charAt(idx);
            System.out.println(newStr);
            return;
        }
        newStr += str.charAt(idx);
        printRevStr(str, idx-1 , newStr);
    }
}
