// finally block always run if exception occure or not.
public class FinallyKeyword {
    public static void main(String[] args) {
        try{
            String st = null;
            System.out.println(st.length());
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("You are in finally block");
        }
    }
}
