import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int []arr = {5,4,3,2,1};
        // if(arr.length % 2 == 0){
            for(int i = 0 ; i < arr.length/2 ; i++ ){
                // swap
                int temp = arr[i];
                arr[i] = arr[arr.length-1-i];
                arr[arr.length-1-i] = temp;
               
            }
        // }
        System.out.println(Arrays.toString(arr));
    }  
    }
    
