import java.util.Stack;

public class pushElementAtBottom {
    public static void pushAtBottom(Stack<Integer> s, int ele) {
        if (s.isEmpty()) {
            s.push(ele);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, ele);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
