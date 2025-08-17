import java.util.Stack;

public class ValidParenthesis {
    public static boolean findValidity(String str) {
        if (str.length() == 0) {
            return true;
        }

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (currChar == '(' || currChar == '{' || currChar == '[') {
                s.push(currChar);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && currChar == ')') || (s.peek() == '{' && currChar == '}')
                        || (s.peek() == '[' && currChar == ']')) {

                    s.pop();
                } else {
                    return false;
                }
            }
        }

        while (!s.isEmpty()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String para = "({[]})[]";

        System.out.println(findValidity(para));
    }
}
