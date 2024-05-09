class MyException extends Exception{
    public String toString(){
        return "abc Exception";
    }
    public String getMessage(){
        return "Charecter cannot be lower case";
    }
}
public class cutExp {
    public static void main(String[] args) {
        try{
            throw new MyException();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        finally{
            System.out.println("You are in finally block");
        }
    }
}
