public class Sum_Natural {
    public static void main(String[] args) {
        int n = 2;
        int i = 0;
        int sum = 0;
        CalcSum(n, i, sum);
    }
    public static void CalcSum(int n , int i , int sum){
        if(i == n){
            System.out.println(sum);
            return ;
        }
        sum += n;
        CalcSum(n, i+1, sum);
    }
}
