public class PreorderTree {
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

        public Node buildTree(int Nodes[]) {
            idx++;
            if (Nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(Nodes[idx]);
            newNode.left = buildTree(Nodes);
            newNode.right = buildTree(Nodes);

            return newNode;
        }

        public void printPreorder(Node root) {
            if (root == null) {
                System.out.print("-1 ");
                return;
            }
            System.out.print(root.data + " ");
            printPreorder(root.left);
            printPreorder(root.right);
        }

        public void printInorder(Node root) {
            if (root == null) {
                System.out.print("-1 ");
                return;
            }
            printInorder(root.left);
            System.out.print(root.data + " ");
            printInorder(root.right);
        }

        public void printPostorder(Node root) {
            if (root == null) {
                System.out.print("-1 ");
                return;
            }
            printPostorder(root.left);
            printPostorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        // tree.printPreorder(root);
        // tree.printInorder(root);
        tree.printPostorder(root);
    }
}