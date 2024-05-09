public class removeDuplicate {
    public static void main(String[] args) {
        String str = "aabbccddefg";
        String newStr = "";
        remove(str, 0, newStr);
    }
    public static void remove(String str , int idx , String newStr){
        if(idx == str.length()-1){
            System.out.println(newStr);
            return;
        }
        remove(str, idx+1, newStr);
        if(str.charAt(idx) != newStr.charAt(idx)){
            newStr += str.charAt(idx); 
        }
        
    }
}
