class square{
    int side;
    public int side(int s){
        System.out.println("Area of square : " + s*s);
        System.out.println("Perimeter of square : " + 4 * s);
        return s*s;
    }
}
public class sy {
    public static void main(String[] args){
    square sq1 = new square();
    System.out.println(sq1.side(2));
    }
}
