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

    public static Node InsertNode(Node root, int val) {
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

    public static boolean searchKey(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data < key) {
            return searchKey(root.right, key);
        } else {
            return searchKey(root.left, key);
        }
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };

        Node root = null;
        for (int val : values) {
            root = InsertNode(root, val);
        }

        InOrder(root);

        System.out.println("\n" + (searchKey(root, 4) ? "Found" : "not found"));
    }
}
