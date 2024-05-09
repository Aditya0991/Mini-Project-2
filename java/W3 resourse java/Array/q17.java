import java.lang.reflect.Array;
import java.util.Arrays;
public class q17 {
    public static void main(String[] args) {
        int []arr = {1,5,8,3,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Second largest element : " + arr[arr.length-2]);
    }
}
