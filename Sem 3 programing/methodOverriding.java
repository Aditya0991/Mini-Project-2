class A {
    void show(){
        System.out.println("show belong to class A");
    }
}
class methodOverriding{
    void show(){
        System.out.println("show belong to class methodOverriding");
    }
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        methodOverriding obj2 = new methodOverriding();
        obj2.show();
    }
}