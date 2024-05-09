import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        Scanner in = new Scanner(System.in);
        for(int i =0 ;i < 2 ; i++){
            for(int j = 0 ; j < 2 ; j++){
                // System.out.println(i+ " " + j);
                a[i][j] = in.nextInt();
            }
        }
       System.out.println(Arrays.deepToString(a));
    }
    

}
