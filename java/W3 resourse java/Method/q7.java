import java.util.Arrays;
public class q7 {
    public static void main(String[] args) {
         calculatePentagonalNumber(40);
    }
    public static void calculatePentagonalNumber(int digit){
        int []arr = new int[50];
        for(int i = 1 ; i<= digit ; i++){
            arr[i-1] = (i*(3*i-1)/2);
        }
        System.out.println(Arrays.toString(arr));
    }
}
