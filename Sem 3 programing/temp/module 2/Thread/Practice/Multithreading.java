class Thread01 implements Runnable{
    public void run(){
        while(true){
            System.out.println("You are in run Method 1");
        }
    }
}
class Thread02 implements Runnable{
    public void run(){
        while(true){
            System.out.println("You are in run Method 2");
        }
    }
}
public class Multithreading {
    public static void main(String[] args) {
        Thread01 t11 = new Thread01();
        Thread02 t12 = new Thread02();
        Thread t1 = new Thread(t11);
        Thread t2 = new Thread(t12);
        t1.setPriority(9);
        t1.start();
        t2.start();
    }
}
