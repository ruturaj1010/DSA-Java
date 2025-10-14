import java.util.ArrayList;

public class MergeBST {
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

    public static void printInorder(Node root) {
        if (root == null) {
            return;
        }

        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    public static void mergeArray(ArrayList<Integer> arr, ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        int i = 0, j = 0;
        while (i <= arr1.size() - 1 && j <= arr2.size() - 1) {
            if (arr1.get(i) <= arr2.get(j)) {
                arr.add(arr1.get(i));
                i++;
            } else {
                arr.add(arr2.get(j));
                j++;
            }
        }

        while (i < arr1.size()) {
            arr.add(arr1.get(i));
            i++;
        }

        while (j < arr2.size()) {
            arr.add(arr2.get(j));
            j++;
        }
    }

    public static Node createBalancedBST(ArrayList<Integer> arr, int st, int ed) {
        if (st > ed) {
            return null;
        }

        int mid = (st + ed) / 2;
        Node root = new Node(arr.get(mid));
        root.left = createBalancedBST(arr, st, mid - 1);
        root.right = createBalancedBST(arr, mid + 1, ed);
        return root;
    }

    public static Node mergeBST(Node root1, Node root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        ArrayList<Integer> arr = new ArrayList<>();
        mergeArray(arr, arr1, arr2);

        return createBalancedBST(arr, 0, arr.size() - 1);
    }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBST(root1, root2);

        printInorder(root);
    }
}
