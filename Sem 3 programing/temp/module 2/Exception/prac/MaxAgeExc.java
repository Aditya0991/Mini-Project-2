import java.net.SocketTimeoutException;

class MaxAge extends Exception{
    public String toString(){
        return "MaxAge Exception";
    }
    public String getMessage(){
        return "Age cannot be greater then 50";
    }
}
public class MaxAgeExc {
    public static void main(String[] args) {
        int age = 70;
        try{
        if(age > 50){
            throw new MaxAge();
        }
    }
    catch(Exception e){
        System.out.println(e.getMessage());
        System.out.println(e.toString());
        e.printStackTrace();
    }
    finally{
        System.out.println("YOu are in Finally  block");
    }
    }
    
}
