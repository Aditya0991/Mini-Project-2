import java.util.Scanner;

class NegativeDimension extends Exception{
    public String toString(){
        return "Negative Dimension Exception";
    }
    public String getMessage(){
        return "Negative Dimension is not possible";
    }
}
public class Question {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a < 0){
        try{
            throw new NegativeDimension();
        }        
        catch (Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    }
}
