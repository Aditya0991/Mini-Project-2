public class LargestElementInArry {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] =87;
        arr[1] =90;
        arr[2] =12;
        arr[3] =32;
        arr[4] =65;
        int lar = Integer.MIN_VALUE;
        for(int i =0 ; i< arr.length-1 ;i++){
            if(lar < arr[i]){
                lar = arr[i];
            }
        }
        System.out.println(lar);
    }
}
