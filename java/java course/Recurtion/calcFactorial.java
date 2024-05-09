public class calcFactorial {
    public static void main(String[] args) {
        int n = 5;
        int out = calcFact(n);
        System.out.println("Factorial of entered number : " + out);
    }
    public static int calcFact(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        int calcfacm1 = calcFact(n-1);
        int calcFact = n * calcfacm1;
        return calcFact;
    }
}
