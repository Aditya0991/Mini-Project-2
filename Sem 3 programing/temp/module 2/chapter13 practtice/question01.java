class thread01 extends Thread{

    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        System.out.println("Good Morning");
        
        }
        
    }
}
class thread02 extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        System.out.println("Good Evening");
        }
    }
}

class question01{
    public static void main(String[] args) {
        thread01 t1 = new thread01();
        thread02 t2 = new thread02();
        t1.start();
        t2.start();
    }
}