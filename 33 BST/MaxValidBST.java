public class MaxValidBST {
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

    static class Info {
        boolean isValid;
        int size;
        int min;
        int max;

        Info(boolean isValid, int size, int min, int max) {
            this.isValid = isValid;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int max_count = 0;

    public static Info largestBST(Node root) {

        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;

        if (leftInfo.isValid && rightInfo.isValid &&
            root.data > leftInfo.max && root.data < rightInfo.min) {

            int min = Math.min(root.data, leftInfo.min);
            int max = Math.max(root.data, rightInfo.max);
            max_count = Math.max(max_count, size);

            return new Info(true, size, min, max);
        }

        return new Info(false, size, 0, 0);
    }

    public static void main(String[] args) {

        Node root = new Node(50);

        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        Info data = largestBST(root);
        System.out.println(data.isValid + " " + data.size + " " + data.min + " " + data.max);
        System.out.println(max_count);
    }
}
