public class Recurtion01{
    public static void main(String[] args) {
        int n = 5;
        printNumber(n);
    }
    public static void printNumber(int n){
        if (n == 0 || n == 1){
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }
}