import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
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

    static class BinaryTrees {

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

        public void printLevelorder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTrees tree = new BinaryTrees();
        Node root = tree.buildTree(nodes);

        // tree.printPreorder(root);
        // tree.printInorder(root);
        // tree.printPostorder(root);
        tree.printLevelorder(root);
    }
}