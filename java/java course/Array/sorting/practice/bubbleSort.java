import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int []arr = {5,2,8,6,3};
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length - i - 1 ; j++){
                if(arr[j] > arr[j+1]){
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
