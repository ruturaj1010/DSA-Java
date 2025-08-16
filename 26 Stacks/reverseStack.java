import java.util.Stack;

public class reverseStack {
    public static void pushAtBottom(Stack<Integer> s,int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;        
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void revStack(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        revStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            System.out.println();
            return;
        }
        int top = s.pop();
        System.out.print(top +" ");
        printStack(s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        printStack(s);
        revStack(s);
        printStack(s);
    }
}
