class thread1 extends Thread{
    public void run(){
        while(true){
            System.out.println("I am cooking ");
        }
    }
}

class thread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("I am chating ");
        }
    }
}
class threadsInJava{
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
    }
}