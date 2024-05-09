public class q2 {
    public static void main(String[] args) {
        int []arr = {5,2,6,7,1};
        int sum = 0;
        for(int i = 0; i <=arr.length-1 ; i++){
            sum += arr[i];
        }
        System.out.println("Sum of array : " + sum);
    }
}
