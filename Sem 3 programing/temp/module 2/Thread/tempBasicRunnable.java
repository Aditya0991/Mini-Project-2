class Myrunnable1 implements Runnable{
    public void run(){
        while (true)
        System.out.println("My runnable Thread 1");
    }
}
class Myrunnable2 implements Runnable{
    public void run(){
        while (true)
        System.out.println("My runnable Thread 2");
    }
}
public class tempBasicRunnable {
    public static void main(String[] args) {
        Myrunnable1 r1 = new Myrunnable1();  
        Myrunnable2 r2 = new Myrunnable2();  
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
