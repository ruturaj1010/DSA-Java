public class CreateBalTree {
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

    public static Node createTree(int Nodes[], int st, int ed) {
        if (st > ed) {
            return null;
        }

        int mid = (st + ed) / 2;

        Node root = new Node(Nodes[mid]);
        root.left = createTree(Nodes, st, mid - 1);
        root.right = createTree(Nodes, mid + 1, ed);

        return root;
    }

    public static void printTree(Node root) {
        if (root == null) {
            System.out.print("-1 ");
            return;
        }

        System.out.print(root.data + " ");
        printTree(root.left);
        printTree(root.right);

        return;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 8, 10, 11, 12 };

        Node root = createTree(arr, 0, arr.length - 1);

        printTree(root);
    }
}
