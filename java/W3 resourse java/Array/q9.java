import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        int []arr1;
        arr1 = new int [5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 5;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the position at which you want to insert the element : ");
        int idx = in.nextInt();
        for(int i = idx-1;i<arr1.length-1 ; i++){
        arr1[i+1] = arr1[i];
        }
        // System.out.println("Enter the index you want to insert the element : ");
        // int idx_e = in.nextInt();
        System.out.println("Enter the element you want to insert : ");
        int num = in.nextInt();
        arr1[idx-1] =num; 

        System.out.println("Elements of array  :");
        for(int i = 0;i < arr1.length ;i++ ){
            System.out.println(arr1[i]);
        }
    }
}
