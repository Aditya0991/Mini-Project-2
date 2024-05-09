import java.util.ArrayList;

class ArrList{
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<Integer> ar1 = new ArrayList<>();
        ar1.add(4);
        ar1.add(5);
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.addAll(ar1);
        ar.remove(Integer.valueOf(3));
        System.out.println(ar);
        ar.remove(1);
        // ar.clear();
        System.out.println(ar);
    }
}