public class DiameterOfTree {
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

        public Node BuildTree(int Nodes[]) {
            idx++;
            if (Nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(Nodes[idx]);
            newNode.left = BuildTree(Nodes);
            newNode.right = BuildTree(Nodes);

            return newNode;
        }

        public void printTree(Node root) {
            if (root == null) {
                System.out.print("-1 ");
                return;
            }

            System.out.print(root.data + " ");
            printTree(root.left);
            printTree(root.right);
        }

        public int findHeight(Node root) {
            if (root == null) {
                return 0;
            }

            int lefth = findHeight(root.left);
            int righth = findHeight(root.right);

            return Math.max(lefth, righth) + 1;
        }

        public int diameterOfTree(Node root) {
            if (root == null) {
                return 0;
            }

            int ldia = diameterOfTree(root.left);
            int lh = findHeight(root.left);

            int rdia = diameterOfTree(root.right);
            int rh = findHeight(root.right);

            int cdia = lh + rh + 1;

            return Math.max(cdia, Math.max(ldia, rdia));
        }

        static class Info {
            int d;
            int ht;

            Info(int d, int ht) {
                this.d = d;
                this.ht = ht;
            }
        }

        public Info OptiDiaOfTree(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }

            Info li = OptiDiaOfTree(root.left);
            Info ri = OptiDiaOfTree(root.right);

            int fdia = Math.max(Math.max(li.d, ri.d), li.ht + ri.ht + 1);
            int fht = Math.max(li.ht, ri.ht) + 1;
            return new Info(fdia, fht);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree bt = new BinaryTree();
        Node root = bt.BuildTree(nodes);

        // bt.printTree(root);
        // System.out.println();

        // System.out.println(bt.findHeight(root));

        System.out.println(bt.diameterOfTree(root));

        System.out.println(bt.OptiDiaOfTree(root).d);
    }
}
