import java.util.Stack;

public class StackInList {
    public static void main(String[] args) {
        Stack<String> s1 = new Stack<>();
        s1.push("Lion");
        s1.push("Dog");
        s1.push("cat");
        s1.push("Mouse");
        System.out.println(s1);
        System.out.println(s1.peek());
        s1.pop();
        System.out.println(s1);
    }
}
