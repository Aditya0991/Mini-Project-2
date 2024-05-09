import java.util.Arrays;

public class intertion09 {
    public static void main(String[] args) {
        // int []arr = {1,2,4,5,6,7};
        int []arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;
        int element = 3;
        int pos = 2;
        for(int i = arr.length-1 ; i > pos ; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = element;
        System.out.println(Arrays.toString(arr));
    }
}
