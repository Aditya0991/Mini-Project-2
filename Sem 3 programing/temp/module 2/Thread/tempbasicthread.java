class MyThread1 extends Thread{
    public void run(){
        while(true){
            System.out.println("You are in run Method 1");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("You are in run Method 2");
        }
    }
}
public class tempbasicthread {
    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1();
        MyThread2 th2 = new MyThread2();
        th1.setPriority(Thread.MIN_PRIORITY);
        th1.start();
        th2.start();
    }
}
