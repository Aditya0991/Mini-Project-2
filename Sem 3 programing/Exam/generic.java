import java.util.List;
import java.util.*;
class MyGeneric<T>{
    private List<T> values;
    void add(T value){
        values.add(value);
    }
    T get (int index){
        return values.get(index);
    }
}
public class generic {
    public static void main(String[] args) {
        List<Integer> l = new List<>(); 
            l.add(1);
        Iterator i = l.iterator();
        if(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
