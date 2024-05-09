import java.util.Scanner;
public class q12 {
    public static void main(String[] args) {
        int []arr = new int [10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 234;
        arr[4] = 4;
        arr[5] = 5;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the position you want to remove");
        int idx = in.nextInt();
        for (int i = idx-1;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        System.out.println("arr : ");
        for(int i = 0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}
