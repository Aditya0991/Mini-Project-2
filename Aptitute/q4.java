// Sum of array of 5 elements
public class q4 {
    public static void main(String[] args) {
        int arr[]={23,45,676,89,23};
        int sum=0;
        for(int i=0 ;i<arr.length; i++){
            sum =sum+arr[i];

        }
        System.out.println((float)sum/(float)arr.length);
    }
}
