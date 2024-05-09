import java.util.ArrayList;

class sintex{
    public static void main(String[] args) {
        ArrayList<Integer> L1 = new ArrayList<>();
        ArrayList<Integer> L2 = new ArrayList<>();
        // Methods
        L2.add(10);
        L2.add(20);
        L2.add(30);L1.add(1);L1.add(2);L1.add(3);L1.add(4);
        L1.addAll(L2);
        System.out.println(L1.contains(2));
        System.out.println(L1.indexOf(10));
        L1.remove(3);
        // L1.clear();
        System.out.println(L1.toString());
        // for(int i = 0 ; i < L1.size(); i++){
        //     System.out.print(L1.get(i)+ ", ");
        // }
    }
}