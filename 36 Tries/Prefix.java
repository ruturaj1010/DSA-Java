public class Prefix {
    static class Node {
        Node children[] = new Node[26];
        boolean isEnd = false;
        int freq;

        Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 0;
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
            
            curr.freq++;
            curr = curr.children[idx];
        }

        curr.isEnd = true;
    }

    public static String getUniquePrefix(String word) {
        Node curr = root;
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            curr = curr.children[idx];
            prefix.append(word.charAt(i));

            if (curr.freq == 1) {
                break;
            }
        }
        return prefix.toString();
    }

    public static void main(String[] args) {
        String words[] = { "zebra", "dog", "duck", "dove" };

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        for (String w : words) {
            System.out.println(w + " -> " + getUniquePrefix(w));
        }
    }
}
