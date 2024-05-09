class rectangle{
    int length , breath;
    public int area(int length , int breath){
        System.out.println("Area of rectangle is : ");
        return length*breath;
    }
    public int Perimeter(int length , int breath){
        System.out.println("Perimeter of rectangle is : ");
        return 2*(length+breath);
    }
}
public class rec {
    public static void main(String[] args){
        rectangle r1 = new rectangle();
        System.out.println(r1.area(5, 2));
        System.out.println(r1.Perimeter(5, 2));
    }
}
