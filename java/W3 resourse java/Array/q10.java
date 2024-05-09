public class q10 {
    public static void main(String[] args){
        int []arr1 = {2,6,1,9,5,7,90};
        int max = arr1[0];
        int min = arr1[0];
        for(int i = 0 ;i<arr1.length ;i++){
            if(max < arr1[i]){
                max = arr1[i];
            }
        }
        for(int i = 0 ;i<arr1.length ;i++){
            if(min > arr1[i]){
                min = arr1[i];
            }
        }
        System.out.printf("Maximum value of array is %d and Minimum value of array %d is ", max,min);
    }
}
