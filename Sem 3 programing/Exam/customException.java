class MyException extends Exception{
    public String toString(){
        return "Above 100 excepiton";
    }
    public String getMessage(){
        return "value is above 100";
    }
}
public class customException {
    public static void main(String[] args) {
        try{
            // throw new ArithmeticException();
            throw new MyException();
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
