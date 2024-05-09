import java.lang.reflect.Array;
import java.util.Arrays;

public class revArray {
    public static void main(String[] args) {
        int []arr = {1,4,7,8};
        for(int i = 0 ; i < arr.length /2;i++ ){
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
