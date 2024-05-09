class MyException extends Exception{
    public String toString(){
        return "I am to String";
    }
    public String getMessage(){
        return "I am in get message";
    }
}
public class customException {
    public static void main(String[] args) {
        try{
            throw new NullPointerException("This is arithmetic Exception");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());

        }
    }    
}
