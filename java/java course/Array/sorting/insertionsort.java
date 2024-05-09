public class insertionsort {
    public static void main(String[] args) {
        int []arr = {5,1,6,2,4,3};
        for(int i = 1 ; i < arr.length ; i++){
            
            for (int j = 0 ; j < i ; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
    public static void printArray(int arr[]){
        for (int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
