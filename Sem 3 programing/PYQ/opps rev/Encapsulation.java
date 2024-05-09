class SmartPhone{
    private String fea;
    private String startinglog;
   
    public void setstartinglog(String s){
        this.startinglog = s;
    }
    public void setfea(String camera){
        this.fea = camera; 
    }
    public String getStartinglog() {
        return startinglog;
    }
    public String getfe(){
        return fea;
    }
    
}
public class Encapsulation {
    public static void main(String[] args) {
        SmartPhone e1 = new SmartPhone();
        e1.setfea("64");
        e1.setstartinglog("Welcome");
        System.out.println(e1.getStartinglog());
        System.out.println(e1.getfe());
    }
}
