public class KthAncestorOfNode {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int findAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int lp = findAncestor(root.left, n, k);
        int rp = findAncestor(root.right, n, k);

        if (lp != -1) {
            if (lp + 1 == k) {
                System.out.println(root.data);
            }
            return lp + 1;
        }

        if (rp != -1) {
            if (rp + 1 == k) {
                System.out.println(root.data);
            }
            return rp + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        findAncestor(root, 5, 2);
    }
}
