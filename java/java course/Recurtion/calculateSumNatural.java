public class calculateSumNatural{
    public static void main(String[] args) {
        int n = 5;
        sumOfNNaturalNumber(1,5,0);
        
    }
    public static void sumOfNNaturalNumber(int i , int n , int sum){
        if (i == n){
            sum += i;
            System.out.println("Sum of n natural number : " + sum);
            return;
        }
        sum += i;
        sumOfNNaturalNumber(i+1, n, sum);
    }
}