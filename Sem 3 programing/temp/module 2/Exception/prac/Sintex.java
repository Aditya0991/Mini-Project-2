public class Sintex {
    public static void main(String[] args) {
        try{
            int c = 10/0;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        finally{
            System.out.println("Program ended");
        }
    }
}
