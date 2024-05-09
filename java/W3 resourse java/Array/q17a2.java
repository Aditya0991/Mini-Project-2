
public class q17a2 {
    public static void main(String[] args){
        int []arr = {1,5,8,3,6};
        int largest = Integer.MIN_VALUE;
        int sec_largest = Integer.MIN_VALUE;
        int count = 0;
        System.out.println(largest);
        for(int i = 0; i<arr.length ;i++){
            if(arr[i] > largest){
                sec_largest = largest;
                largest = arr[i];
                count++;
            }

            if(arr[i] < largest && arr[i] > sec_largest){
                sec_largest = arr[i];
            }
        }
        if(count > 1){
            sec_largest = -1;
        }
        
        System.out.println(sec_largest);

    }
}
