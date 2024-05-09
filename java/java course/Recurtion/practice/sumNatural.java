public class sumNatural {
    public static void main(String[] args) {
        int n = 5;
        sumNat(1, n, 0);
    }
    public static void sumNat(int i ,int n ,int sum){
        if(n == i){
            sum += i;
            System.out.println("Sum of N Natural Number : " + sum);
            return; 
        }
        sum +=i;
        sumNat(i+1 , n , sum );
    }
}
