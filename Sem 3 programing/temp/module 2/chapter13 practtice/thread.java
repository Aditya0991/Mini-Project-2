class thread1 extends Thread{
    public void run(){
        int  i = 0;
        while(i < 10000);
        System.out.println("You are in thread 1");
    }
}
class thread2 extends Thread{
    public void run(){
        int i = 0;
        while(i < 10000)
        System.out.println("You are in thread 2");
    }
}
public class thread {
    public static void main(String[] args) {
        thread1 thr1 = new thread1();
        thread2 thr2 = new thread2();
        thr1.start();
        thr2.start();
    }
}
