import java.util.Arrays;

public class palindromArray{
    public static void main(String[] args) {
        int []arr = {111,222,55,989};
        boolean []arr1 = new boolean[arr.length]; 
        String rev = "";
        for(int i = 0 ; i < arr.length ; i++){
            int n = arr[i];
            while(n > 0){
                int r = n % 10;
                rev += r;
                n = n / 10;
    
            }
            System.out.println(rev);
            // if(rev == arr[i]){
            //     arr1[i] = true;
            // }
            rev.setText("");
        }
        System.out.println(Arrays.toString(arr1)); 
    }
    
}