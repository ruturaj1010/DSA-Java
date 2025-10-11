import java.util.ArrayList;

public class LowestCA {
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

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean fLeft = getPath(root.left, n, path);
        boolean fRight = getPath(root.right, n, path);

        if (fLeft || fRight) {
            return true;
        }

        path.remove(path.size() - 1);

        return false;
    }

    public static void LCA(Node root, int n1, int n2) {
        if (root == null) {
            return;
        }

        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        System.out.println(path1.get(i - 1).data);
    }

    public static Node optiLCA(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node lca = optiLCA(root.left, n1, n2);
        Node rca = optiLCA(root.right, n1, n2);

        if (lca == null) {
            return rca;
        }
        if (rca == null) {
            return lca;
        }

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        LCA(root, 7, 6);

        System.out.println(optiLCA(root, 4, 5).data);
    }
}
