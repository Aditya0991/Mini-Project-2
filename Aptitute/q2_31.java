import java.util.Arrays;

// increment element of array by 1
public class q2_31 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = arr[i] + 1;

        }
        System.out.println(Arrays.toString(arr));
    }
}
