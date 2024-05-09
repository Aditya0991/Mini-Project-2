
public class FIndMaximumAndMinimumValue {
    public static void main(String[] args) {
        int []arr = {4,1,8,5,2,7};
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.printf("Largest %d and Smallest %d " , largest , smallest);
    }
   
}
