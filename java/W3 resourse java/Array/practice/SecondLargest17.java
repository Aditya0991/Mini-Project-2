public class SecondLargest17 {
    public static void main(String[] args) {
        int []arr = {5,1,7,9,4};
        int largest = Integer.MIN_VALUE;
        int sec_largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i ++){
            if(arr[i] > largest){
                sec_largest = largest;
                largest = arr[i];

            }
            if((arr[i] < largest)&&(arr[i] > sec_largest)){
                sec_largest = arr[i];
            }
        }
        System.out.println(sec_largest);
    }
}
