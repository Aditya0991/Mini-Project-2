public class q6 {
    public static void main(String[] args) {
        sumOfDigit(11111);
    }

    public static void sumOfDigit(int num){
        int rem,sum = 0;
        while(num>0){
            rem = num % 10;
            sum+=rem;
            num = num/10;
        }
        System.out.println("Sum of entered three digit number " + sum);
    }
}
