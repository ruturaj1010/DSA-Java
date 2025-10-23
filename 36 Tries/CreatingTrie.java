public class CreatingTrie {
    static class Node {
        Node children[] = new Node[26];
        boolean isEnd = false;
        Node (){
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }

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

    public static Node root = new Node() ;
    public static void main(String[] args) {
        String words[] = {"the", "there", "a", "their", "any", "thee"};

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        boolean val = search("their");

        System.out.println("Is there a word " + val);
    }
}
