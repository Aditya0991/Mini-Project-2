class methodOverlod{
    void show(String st){
        System.out.println(st);
    }
    void show(String a , String b){
        System.out.println(a.concat(b));
    }
    public static void main(String[] args) {
        methodOverlod m1 = new methodOverlod();
        m1.show("hello" );

    }
}