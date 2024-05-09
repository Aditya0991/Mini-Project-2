import java.util.Iterator;
import java.util.LinkedList;
public class LinkListInList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        // l1.add("abc");
        // System.out.println(l1);
        Iterator i = l1.iterator();
            while(i.hasNext()){
                System.out.println(i.next());
            }
        }
    }

