public class SecondSmallestElement {
    public static void main(String[] args) {
        int []arr = {3,8,4,9,5};
        int smallest = Integer.MAX_VALUE;
        int sec_Smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < smallest){
                sec_Smallest = smallest;
                smallest = arr[i];
            }
            if((smallest < arr[i] )&&(sec_Smallest > arr[i])){
                sec_Smallest = arr[i];
            }
        }
        System.out.println(sec_Smallest);
    }
}
