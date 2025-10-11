public class BuildingTree {
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

    

    public static void InOrder(Node root) {
        if (root == null) {
            return;
        }

        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }

    public static Node InsertNode (Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = InsertNode(root.left, val);
        } else {
            root.right = InsertNode(root.right, val);
        }

        return root;
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };

        Node root = null;
        for (int val : values) {
            root = InsertNode(root, val);
        }

        InOrder(root);
    }
}
