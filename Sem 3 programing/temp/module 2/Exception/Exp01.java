import java.util.Scanner;
class Exp01{
    public static void main(String[] args) {
        int []arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        
        arr[3] = 30;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array index :");
        int idx = 3;
        try{
            System.out.println(arr[idx]);
        }
        catch(Exception e){
            System.out.println("Array is out of bond exception");
            System.out.println(e);
        }
    }
}