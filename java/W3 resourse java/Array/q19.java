import java.util.Arrays;

public class q19 {
    public static void main(String[] args) {
        int [][]mat = new int[2][2];
        mat[0][0] = 1;
        mat[0][1] = 1;
        mat[1][0] = 1;
        mat[1][1] = 1;
        
        int [][]mat1 = new int[2][2];
        mat1[0][0] = 7;
        mat1[0][1] = 1;
        mat1[1][0] = 3;
        mat1[1][1] = 1;

        int [][]sum = new int[2][2];
        for (int i = 0 ; i<mat.length ; i++){
            for(int j = 0; j< mat.length ;j++)
            sum[i][j] = mat[i][j] + mat1[i][j];
        }

        for (int i = 0 ; i<mat.length ; i++){
            for(int j = 0; j< mat.length ;j++)
            System.out.print(sum[i][j] + " ");
            System.out.println();
        }
        
    }
}
