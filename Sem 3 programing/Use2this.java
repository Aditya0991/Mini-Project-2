public class Use2this {
    void printName(){
        System.out.println("Aditya");
    }
    void methodTwo(){
        this.printName();
    }
    public static void main(String[] args) {
        Use2this obj =new Use2this();
        obj.methodTwo();
    }
}
