public class ExceptionType {
    public static void main(String[] args) {
        // Checked Exception throws Exception at compile time.
        // Below are unchecked Exception-
        // Means its throws Error at run time not at compile time.
        try{
        System.out.println(100/0); //Arithmetic Exception
        // String st = null;
        // System.out.println(st.length()); //NullPointerException
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
