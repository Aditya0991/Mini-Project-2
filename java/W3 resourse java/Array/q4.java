import javax.swing.text.Style;

public class q4 {
    public static void main(String[] args) {
        // int []arr = {1,2,3,4,5,6,7,8,9,10};
        int []arr = {3,4,5,7,9};
        double sum = 0;
        for(int i = 0;i<arr.length ; i++){
            sum += arr[i];
        }
        double avg = sum/arr.length;
        System.out.println("average of above array : " );

        System.out.printf("%.2f",avg);
    }
}
