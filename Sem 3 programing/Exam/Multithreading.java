class MyRun implements Runnable{
    public void run(){
        while(true)
        System.out.println(1);
    }
}
class MyRun02 implements Runnable{
    public void run(){
        while(true){
            try{
                Thread.sleep(2000);
            System.out.println(2);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
class Multithreading{
    public static void main(String[] args) {
        MyRun r1 = new MyRun();
        MyRun02 r2 = new MyRun02();
        Thread t1  = new Thread(r1);
        Thread t2  = new Thread(r2);
        t1.setPriority(8);
        t1.start();
        t2.start();


    }
}