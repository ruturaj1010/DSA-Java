import java.util.ArrayList;

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

        printTree(root.left);
        System.out.print(root.data + " ");
        printTree(root.right);

        return;
    }
    
    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);

        return;
    }
    public static Node createBST (ArrayList<Integer> inorder, int st, int ed) {
        if (st > ed) {
            return null;
        }

        int mid = (st + ed)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st, mid-1);
        root.right = createBST(inorder, mid+1, ed);

        return root;
    }
    public static Node intoBalancedTree (Node root) {
        if (root == null) {
            return null;
        }

        // Sort the Nodes in Inorder pattern
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        // Convert it into Balanced Binary search tree
        return createBST(inorder, 0, inorder.size()-1);
    }

    public static void main(String[] args) {
        // int arr[] = { 3, 5, 6, 8, 10, 11, 12 };

        // Node root = createTree(arr, 0, arr.length - 1);

        // printTree(root);

        Node root = new Node(8);
        root.left = new Node(6);
        root.right = new Node(10);
        root.left.left = new Node(5);
        root.right.right = new Node(11);
        root.left.left.left = new Node(3);
        root.right.right.right = new Node(12);

        Node newRoot = intoBalancedTree(root);
        printTree(newRoot);
    }
}
