public class permutationQuestion{
    
    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str, "");
    }
    public static void printPermutation(String str , String Permutation){
        if(str.length() == 0){
            System.out.println(Permutation);
            return;
        }
        for(int i = 0 ; i < str.length() ; i++){
            char currentchar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring( i+1);
            printPermutation(newStr, Permutation + currentchar);
        }
    }
}