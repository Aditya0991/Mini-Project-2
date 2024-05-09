interface basicAnimal{
    abstract void eat();
    abstract void sleep();
}
class monkey{
    void jump(){
        System.out.println("Jump");
    }
    void bite(){
        System.out.println("Bite");
    }
}
class human extends monkey implements basicAnimal{
    @Override
    public void eat() {
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}
public class CWH02 {
    public static void main(String[] args) {
        human h1 = new human();
        h1.jump();  // class
        h1.eat();   //interface
    }
}
