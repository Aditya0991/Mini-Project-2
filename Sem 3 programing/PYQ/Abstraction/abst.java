abstract class Myabs {
     abstract int rectangle(int l,int b);
}
public class abst extends Myabs{
    int rectangle(int l , int b){
        return l*b;
    }
    public static void main(String[] args) {
        abst obj = new abst();
        System.out.println(obj.rectangle(5, 4));
        
    }
}
