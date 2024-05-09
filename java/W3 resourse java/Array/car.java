abstract class vehicle {
    abstract void start();
}
class car extends vehicle{
    void start(){
        System.out.println("Push the start button to start the engine");
    }
    public static void main(String[] args){
        car Audi = new car();
        Audi.start();
    }
}