import java.util.Stack;

public class reverseString {
    public static void StringRev( String str) {
        Stack<Character> s = new Stack<>();

        int idx  = 0;
        while ( idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder newStr = new StringBuilder("");
        while (!s.isEmpty()) {
            char newChar = s.pop();
            newStr.append(newChar);
        }

        System.out.println(newStr.toString());
    }

    public static void main(String[] args) {
        String str = "abc";

        StringRev( str);
    }
}
