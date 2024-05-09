public class PYQ2018_18Q2 {
    long fact(int num){
        long fac = 1; 
        while(num > 0){
            fac *=num;
            num--;
        }
        return fac;
    }
    String checkPrime(int num){
        int temp = 2;

        while(temp < num){
            if(num % temp == 0){
                return "Not Prime";
            }
            temp++;
        }
        return "Prime";
    }
    public static void main(String[] args) {
        PYQ2018_18Q2 obj = new PYQ2018_18Q2();
        System.out.println(obj.fact(13));
        System.out.println(obj.checkPrime(13));
    }
}
