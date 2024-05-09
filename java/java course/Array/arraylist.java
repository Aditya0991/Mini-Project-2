import java.util.ArrayList;
public class arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(7);
        list.add(21);
        list.add(2,77);
        System.out.println(list);

        list.set(1, 8);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.print("Size of array : ");
        int size = list.size();
        System.out.println(size);
        
        System.out.println("Elements of array : ");
        for(int i = 0; i<list.size() ; i++){
            System.out.println(list.get(i));
        }
    }
}