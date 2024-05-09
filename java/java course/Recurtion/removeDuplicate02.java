import java.util.Arrays;
public class removeDuplicate02 {
    public static boolean []arr = new boolean[26];
    public static void main(String[] args) {
        // 
        String str = "aaabdsbd";
        String newstr = "";
        removedup(str,0, newstr);
        System.out.println(Arrays.toString(arr));
    }
    public static void removedup(String str , int idx , String newstr){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        char currentchar = str.charAt(idx);
        if(arr[currentchar - 'a'] == true){
            removedup(str, idx+1 , newstr);
        }
        else{
            newstr += currentchar;
            arr[currentchar - 'a'] = true;
            removedup(str, idx+1, newstr);
        }
    }
}
