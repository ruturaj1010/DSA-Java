public class WordBreak {
    static class Node {
        Node children[] = new Node[26];
        boolean isEnd = false;
        public Node () {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) { // O(L)
        Node curr = root;

        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.isEnd = true;
    }

    public static boolean search(String key) {
        Node curr = root;

        for (int level = 0; level < key.length(); level++) {
            char ch = key.charAt(level);
            int idx = ch - 'a';

            if (curr.children[idx] == null ) {
                return false;
            }

            curr = curr.children[idx];
        }

        return curr.isEnd == true;
    }

    public static boolean wordBreak(String key){

        if (key.length() == 0) {
            return true;
        }

        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0,i)) && wordBreak(key.substring(i)))  {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String words[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        String key = "ilikesamsung";

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(wordBreak(key));
    }
}
