import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    static class Stack {
        Deque<Integer> d = new LinkedList<>();

        public void push(int data) {
            d.addLast(data);
        }

        public int pop() {
            return d.removeLast();
        }

        public int peek() {
            return d.getLast();
        }
    }

    static class Queue {
        Deque<Integer> d2 = new LinkedList<>();

        public void add(int data) {
            d2.addLast(data);
        }

        public int remove() {
            return d2.removeFirst();
        }

        public int peek() {
            return d2.getFirst();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
    }
}
