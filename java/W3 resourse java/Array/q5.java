import java.util.Scanner;

public class q5 {
    public static void main(String[] args){
        int []arr = {5,9,2,0,1,7};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to check : ");
        int num = in.nextInt();
        Boolean boo = false;
        for(int i = 0; i<arr.length;i++ ){
            if (num == arr[i]){
                boo = true;
                break;
            }        
        }
       if (boo == true){
        System.out.println("Element is present " );
        
       }
       else {
        System.out.println("Element is not present");
       }
        
    }
}
