class thread extends Thread{
    public void run(){
        while(true)
        System.out.println("Good morning ");
    }
}
class thread2 extends Thread{
    public void run(){
        while(true)
        System.out.println("Good Evening ");
    }
}
public class QuesSetPriority {
    public static void main(String[] args) {
        thread t1 = new thread();
        thread2 t2 = new thread2();
        t1.setPriority(1);
        t2.setPriority(9);
        t1.start();
        t2.start();
        // System.out.println(t1.getPriority());
    }
}
