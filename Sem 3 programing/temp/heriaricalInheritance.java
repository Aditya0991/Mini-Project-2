class heriaricalInheritance{
    int a =10;
    public static void main(String[] args) {
        B O1 = new B();
        System.out.println("Accesing using b class : " + O1.a + " " + O1.b);
        C O2 = new C();
        System.out.println("Accesing using c class : " + O2.a );
        heriaricalInheritance O3 = new heriaricalInheritance();
        System.out.println("Accesing using a class : " + O3.a );
    }
}
class B extends heriaricalInheritance{
    int a  = 20;
    int b = 100;
}
class C extends heriaricalInheritance{
    // int a =30;
}