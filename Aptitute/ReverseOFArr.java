import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseOFArr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int temp[] = new int [arr.length];
        // for(int i = arr.length-1 ; i >= 0 ;i--){
        //     System.out.print(arr[i] +" ");
        // }
        int i = 0;
            for(int j = arr.length -1; j >=0 ; j--){
                temp[i] = arr[j];
                i++;
            }
        
        
        System.out.println(Arrays.toString(temp));
    }
}
