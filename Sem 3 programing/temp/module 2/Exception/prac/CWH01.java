class Mythread extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }
    }
}
class MyTHread02 extends Thread{
    public void run(){
        try{
        while(true){
            Thread.sleep(200);
            System.out.println("Welcome");
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
}
public class CWH01 {
    public static void main(String[] args) {
        Mythread t1= new Mythread();
        MyTHread02 t2= new MyTHread02();
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }    
}
