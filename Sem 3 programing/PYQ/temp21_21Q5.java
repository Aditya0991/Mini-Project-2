public class temp21_21Q5 {
    public static int div(int a , int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args) {
        try{
            div(22,7);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
