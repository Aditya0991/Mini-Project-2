class function{
    String Message;
    String call;
    public String call(){
        return "Ring";
    }

    public String Message(){
        return "Vibrate";
    }
}
public class phone{
    public static void main(String[] args) {
        function Apple = new function();
        System.out.println(Apple.call());
        System.out.println(Apple.Message());
    }
}