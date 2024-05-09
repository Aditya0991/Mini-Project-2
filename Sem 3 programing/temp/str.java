public class str {
    public static void main(String[] args) {
        String str = "aabc";
        char c = nonrep(str);
        System.out.println(c);
    }
    public static char nonrep(String S){
        int count = 0;
        for(int i = 0 ; i < S.length()-1 ; i++){
        char currentchar = S.charAt(i);
            for(int j = i+1 ; j < S.length() ; j++){
                if(currentchar == S.charAt(j)){
                    count++;
                }
            }
            System.out.println(count);
            if(count == 0){
                return currentchar;
            }
            
        }
        return '$';
    }
}
