import java.util.Stack;

public class reverseString {
    public static void StringRev(Stack<Character> s, String str) {
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        str = "";
        while (!s.isEmpty()) {
            System.out.print(str + s.peek());
            s.pop();
        }

        System.out.println(str);
    }

    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = "abc";

        StringRev(s, str);
    }
}
