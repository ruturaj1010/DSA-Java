public class MinDistanceInNodes {
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

    public static Node getLCA (Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node llca = getLCA(root.left, n1, n2);
        Node rlca = getLCA(root.right, n1, n2);

        if (llca == null) {
            return rlca;
        }
        if (rlca == null) {
            return llca;
        }

        return root;
    }

    public static int getdist(Node root,int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int lp = getdist(root.left, n);
        int rp = getdist(root.right, n);

        if (lp > -1) {
            return lp + 1;
        }
        if (rp > -1) {
            return rp + 1;
        }
        return -1;
    }

    public static void dist(Node Oroot, int n1, int n2){
        
        Node lca = getLCA(Oroot, n1, n2);

        System.out.println(getdist(lca, n1) + getdist(lca, n2));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        dist(root, 4, 6);
    }
}
