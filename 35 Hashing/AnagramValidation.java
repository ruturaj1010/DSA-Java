import java.util.HashMap;

public class AnagramValidation {

    public static boolean isAnagram(String str, String ang) {

        if (str.length() != ang.length()) {
            return false;
        }

        HashMap<Character, Integer> s = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            s.put(str.charAt(i), s.getOrDefault(str.charAt(i), 0) + 1);
        }

        for (int i = 0; i < ang.length(); i++) {
            char ch = ang.charAt(i);
            if (s.get(ch) != null) {
                if (s.get(ch) == 1) {
                    s.remove(ch);
                } else {
                    s.put(ch, s.get(ch) - 1);
                }
            } else {
                return false;
            }
        }

        return s.isEmpty();
    }

    public static void main(String[] args) {
        String str = "race";  // O(n)
        String ang = "care";

        System.out.println(isAnagram(str, ang));
    }
}
