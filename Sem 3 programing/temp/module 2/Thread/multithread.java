class mythread1 extends Thread{
    public mythread1(String name){
        super(name);
    }
    public void run(){
        int i = 0; 
        while (i < 10){
        System.out.println("Thank you" + this.getName());
        i++;
        }
    }
}
public class multithread {
    public static void main(String[] args) {
        mythread1 t1 = new mythread1("Aditya");
        mythread1 t2 = new mythread1("kumar");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        
    }
}
