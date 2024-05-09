public class removeduplicate02 {
    public static boolean []arr = new boolean[26];
    public static void main(String[] args) {
        String str  = "aabbdxcdcca";
        String newStr = "";
        remdup(str, 0, newStr);
    }
    public static void remdup(String str, int idx , String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currentchar = str.charAt(idx);
        if(arr[currentchar - 'a'] == true){
             remdup(str, idx+1, newStr);
        }
        else{
            newStr += currentchar;
            arr[currentchar - 'a'] =  true;
            remdup(str, idx+1, newStr);

        }
    }
}
