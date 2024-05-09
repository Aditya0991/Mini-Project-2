import java.util.ArrayList;
import java.util.Iterator;
class Arr{
    public static void main(String[] args) {
        ArrayList<Object> a1= new ArrayList<>();
        a1.add(1);
        a1.add("hello");
        a1.add(2);
        a1.add(3);
        a1.add(4);
        Iterator i = a1.iterator();
            while(i.hasNext()){
                System.out.println(i.next());
            }
    }
}