import java.util.ArrayList;

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

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
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

    public static Node delete(Node root, int val) {

        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {

            // case 1 no children
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 with single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 voila case having both childs
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void printInrange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (k1 <= root.data && root.data <= k2) {
            printInrange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInrange(root.right, k1, k2);
        } else if (k1 < root.data) {
            printInrange(root.left, k1, k2);
        } else {
            printInrange(root.right, k1, k2);
        }
    }

    public static void printPaths(ArrayList<Integer> path) {
        for (Integer val : path) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void rootToLeaf(Node root, ArrayList<Integer> path) {

        if (root == null) {
            return;
        }

        path.add(root.data);

        if (root.left == null && root.right == null) {
            printPaths(path);
        } else {
            rootToLeaf(root.left, path);
            rootToLeaf(root.right, path);
        }

        path.remove(path.size()-1);
    }

    public static boolean isValidBST(Node root, Node min, Node max ) {
        if (root == null) {
            return true;
        }

        if (min != null && root.data <= min.data) {
            return false;
        }

        if (max != null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static Node mirrorBST(Node root) {
        if (root == null) {
            return null;
        }

        Node lefts = mirrorBST(root.left);
        Node rights = mirrorBST(root.right);

        root.left = rights;
        root.right = lefts;

        return root;
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 12, 14 };

        Node root = null;
        for (int val : values) {
            root = InsertNode(root, val);
        }
        // InOrder(root);

        // System.out.println("\n" + (searchKey(root, 4) ? "Found" : "not found"));

        // root = delete(root, 3);

        // InOrder(root);

        // printInrange(root, 5, 12);

        // ArrayList<Integer> path = new ArrayList<>();
        // rootToLeaf(root , path);

        // System.out.println((isValidBST(root, null, null) ? "Valid" : "Invalid"));

        root = mirrorBST(root);
        preOrder(root);
    }
}
