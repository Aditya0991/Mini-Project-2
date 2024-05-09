import java.util.ArrayList;
import java.util.Iterator;
class ArrayListInList{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(80);
        newList.add(90);

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(1,100);
        al.addAll(newList);
        // System.out.println(al.get(1));
    
        // System.out.println(al);
        // al.remove(1);// Remove element at Specified Index
        // al.remove(Integer.valueOf(100));
        System.out.println(al.valueOf(100));
        // System.out.println(al);
        // System.out.println(al.contains(2));
        // for(int i = 0 ; i < al.size() ; i++){
        //     System.out.println("Using for loop " + al.get(i));
        // }
        // for(Integer i : al){
        //     System.out.println("Using for each loop " + i);
        // }
        Iterator i = al.iterator();
            while(i.hasNext()){
                System.out.println(i.next());
            }
        }
    }
