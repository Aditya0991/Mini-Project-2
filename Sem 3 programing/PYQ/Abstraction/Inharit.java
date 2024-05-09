interface car{
    abstract void Mahindra();
    abstract void Tata();
}
public class Inharit implements car{
    @Override
    public void Mahindra() {
        System.out.println("welcome Mahindra");
    }
    public void Tata(){
        System.out.println("Welcome Tata");
    }
    public static void main(String[] args) {
        Inharit i1 = new Inharit();
        i1.Mahindra();
        i1.Tata();
    }
}
