public class q10 {
    public static void main(String[] args) {
        checkleap(1700);
    }
    public static void checkleap(int year){
        if (year / 4 == 0 || year / 400 == 0 ){
            System.out.println("Entered year is a leap year");
        }
        else{
            System.out.println("Entered year is not a leap year");
        }
    }
}
