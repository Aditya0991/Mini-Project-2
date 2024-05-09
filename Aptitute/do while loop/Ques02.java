import java.lang.Thread;
public class Ques02 {
    public static void main(String[] args) {
        try{
            do{
                System.out.println("GLA is best");
                Thread.sleep(2*1000);
            }while(true);

        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}
