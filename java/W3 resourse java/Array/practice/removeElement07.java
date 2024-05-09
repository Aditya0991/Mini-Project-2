import java.util.Arrays;

public class removeElement07 {
    public static void main(String[] args) {
        int []arr = {1,2,4,3,4,5,6,7,8,9};
        int removeidx = 2;
        for(int i = removeidx ; i < arr.length -1  ; i++){
            arr[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
