import java.util.LinkedList;
import java.util.Queue;

public class LinkListInQueue {
    public static void main(String[] args) {
        Queue<Integer> q1= new LinkedList<>();
        q1.offer(1);
        q1.offer(2);
        q1.offer(3);
        q1.offer(4);
        System.out.println(q1);
        System.out.println(q1.poll());//To remove the Element
        System.out.println(q1.peek());
    }
}
