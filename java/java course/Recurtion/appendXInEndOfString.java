public class appendXInEndOfString {
    public static void main(String[] args) {
        String st = "axbcdxfxx";
        String st1 = "";

        requiredString(st, 0, 0, st1);
    }
    public static void requiredString(String st ,int count ,int idx, String st1){
        if(idx == st.length()-1){
            for(int i = 0 ; i<= count ; i++){
                st1 +='x';
            }
            System.out.print(st1);
            return;
        }
        char currentchar = st.charAt(idx);
        if(currentchar == 'x'){
            count++;
            requiredString(st, count, idx+1, st1);
        }
        else{
            st1 += currentchar;
            requiredString(st, count, idx+1, st1);
        }
    }
}
