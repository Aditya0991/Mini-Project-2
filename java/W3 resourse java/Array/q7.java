import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        int []arr = {7,3,8,4,1,4};
        int idx = 0;
        boolean boo = false ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the element of arr : ");
        int num = in.nextInt();
        for (int i =0 ;i<arr.length ; i++){
            idx++;
            if (num == arr[i]){
                boo = true;
                break;
            }
        }
        if (boo ==true){
            System.out.printf("Element is present at index : %d" , idx-1);
        }
        else{
            System.out.println("Element is not present");
        }

    }
}
