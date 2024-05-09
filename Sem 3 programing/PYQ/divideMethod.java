public class divideMethod {
    public static int div(int a,int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args) {
        try{
            div(10, 0);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
}
