public class appendAllXOfStringInEnd {
    public static void main(String[] args) {
        String str = "aaxxdbxcdex";
        String newStr = "";
        allxInEnd(str, 0, newStr, 0);
    }
    public static void allxInEnd(String str , int idx, String newStr,int count){
        if(idx == str.length()){
            for(int i = 0; i <= count ;i++){
                newStr+='x';
            }
            System.out.println(newStr);
            return;
        }
        if(str.charAt(idx) == 'x'){
            count++;
        }
        else{
            newStr += str.charAt(idx);
        }
        allxInEnd(str, idx+1, newStr, count);
    }
}
