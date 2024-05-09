import java.util.Scanner;
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(){
        super("Min balance required 1000");
    }
}
class PYQQ120_21{
    public static void main(String[] args) {
        int withdraw = 0;
        int Currentbalance = 5000;
        Scanner sc = new Scanner(System.in);
        withdraw = sc.nextInt();
        try{
        if((Currentbalance-withdraw) < 1000){
            throw new InsufficientBalanceException();
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
}