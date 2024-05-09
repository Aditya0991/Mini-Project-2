import java.util.Arrays;
public class bubblesort{
    public static void main(String[] args) {
        int []arr = {1,2,3,5,4};
        Arrays.sort(arr);;
        System.out.println(Arrays.toString(arr));
        for(int i = 0 ; i < arr.length-2 ; i++){
            int flag = 0;
            for(int j = 0 ; j < arr.length-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1; 
                }
            }
            if (flag ==0){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}