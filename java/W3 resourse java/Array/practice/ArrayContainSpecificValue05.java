import java.util.Scanner;
public class ArrayContainSpecificValue05 {
    public static void main(String[] args) {
        int []arr = {1,4,7,3,9};
        Scanner in = new Scanner(System.in);
        int element = in.nextInt();
        System.out.println(CheckElementIsPresent(arr, element));
        
    }
    public static boolean CheckElementIsPresent(int []arr ,int ele){
        for(int i : arr){
            if(i == ele){
                return true;
            }
        }
        return false;
    }
}

