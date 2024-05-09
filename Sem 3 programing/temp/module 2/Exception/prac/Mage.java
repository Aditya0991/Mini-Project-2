import java.util.Scanner;
class MageException extends Exception{
    public String toString(){
        return "Max Age Exception";
    }
    public String getMessage(){
        return "Age can't be greater then 125";
    }
}
public class Mage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int a = sc.nextInt();
        if(a > 125){
            try{
                throw new MageException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
    }
}
