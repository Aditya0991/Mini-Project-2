class MyRun implements Runnable{
    public void run(){
        while(true)
        System.out.println(1);
    }
}
class MYRun02 implements Runnable{
    public void run(){
        while(true)
        System.out.println(2);
    }
}
public class ThreadRunnable  {
    public static void main(String[] args) {
        MyRun r1 = new MyRun();
    MYRun02 r2 = new MYRun02();
    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);
    t1.start();
    t2.start();
    }
    
}
