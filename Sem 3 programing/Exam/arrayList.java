import java.util.ArrayList;
import java.util.Iterator;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add("a");
        Iterator i = al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
