import java.util.Scanner;
class MaxAge extends Exception{
    public String toString(){
        return "Max Age Exception";
    }
    public String getMessage(){
        return "Age can't be greater then 125";
    }
}
public class QuestionMaxAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();
        if(age > 125){
            try{
                throw new MaxAge();
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
