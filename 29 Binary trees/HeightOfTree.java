public class HeightOfTree {
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

    static class BinaryTree {
        static int idx = -1;

        public Node BuildTree (int Nodes[]) {
            idx++;
            if (Nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(Nodes[idx]);
            newNode.left = BuildTree(Nodes);
            newNode.right = BuildTree(Nodes);

            return newNode;
        }

        public int HeightOfTree(Node root) {
            if (root  == null) {
                return 0;
            }

            int lefth = HeightOfTree(root.left);
            int righth = HeightOfTree(root.right);

            return Math.max(lefth, righth) + 1;
        }

        public int countNodes(Node root) {
            if (root == null) {
                return 0;
            }

            int lCount = countNodes(root.left);
            int rCount = countNodes(root.right);

            return lCount + rCount + 1;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // int nodes[] = { 1, 2, 4, -1, -1, 5, 7, -1, -1, -1, 3, -1, 6, -1, -1 }; // height = 4

        BinaryTree bt = new BinaryTree();
        Node root = bt.BuildTree(nodes);

        // System.out.println(bt.HeightOfTree(root));
        System.out.println(bt.countNodes(root));
    }
}
