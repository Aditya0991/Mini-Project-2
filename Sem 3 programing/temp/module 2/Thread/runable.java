class myrun1 implements Runnable{
    public void run(){
        int i = 0;
        while(i < 10){
        System.out.println("First runnable thread ");
    }
}
}
class myrun2 implements Runnable{
    public void run(){
        int i = 0 ;
        while(i < 10){
        System.out.println("Second runnable thread ");
    }
}
}
public class runable {
    public static void main(String[] args) {
        myrun1 bul = new myrun1();
        Thread gun1 = new Thread(bul);
        myrun2 bul2 = new myrun2();
        Thread gun2 = new Thread(bul2);
        gun1.start();
        gun2.start();
    }
}
