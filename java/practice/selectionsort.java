import java.util.Arrays;
public class selectionsort {
    public static void main(String[] args) {
        
    
    int []arr ={8,5,9,1,7};
    for(int i = 0; i < arr.length ; i++){
        int min = i;
        for(int j = i+1 ; j < arr.length; j++){
            if (arr[j] < arr[min]){
                min = j;
            }
        } 
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
    System.out.println(Arrays.toString(arr));
    }
}
