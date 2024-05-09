
public class Recurtion01 {
    public static void main(String[] args) {
        String str = "abc";
        permutation(str,"");
    }
    public static void permutation(String str, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i = 0 ; i < str.length() ; i++){
            char currentchar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            permutation(newStr,permutation+ currentchar );
        }
    }
}
