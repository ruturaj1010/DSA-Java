import java.util.ArrayList;

public class StackUsingArrayList {

    static class Stack {

        static ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty(){
            return list.size() == 0;
        }

        // push
        public void push(int data) {
            list.add(data);
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String args[]) {
        Stack st = new Stack();
        st.push(3);
        st.push(2);
        st.push(1);

        while (!st.isEmpty()) {
            System.out.print(st.peek() + " | ");
            st.pop();
        }
    }
}