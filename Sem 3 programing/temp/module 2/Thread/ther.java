class thred extends Thread{
    public thred (String name){
        super(name);
    }
    public void run(){
        int i = 0 ; 
        while(i < 333333){
        System.out.println(this.getName());
        i++;
        }
    }
} 
public class ther {
    public static void main(String[] args) {
        thred t1 = new thred("Aditya");
        thred t2 = new thred("kumar");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
