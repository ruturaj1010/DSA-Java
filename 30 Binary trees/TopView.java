import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopView {
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
        Node node;
        int hDist;

        Info(Node node, int hDist) {
            this.node = node;
            this.hDist = hDist;
        }
    }

    public static void topView(Node root) {
        if (root == null) {
            return;
        }

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        // q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            // if (curr == null) {
            //     if (q.isEmpty()) {
            //         break;
            //     } else {
            //         q.add(null);
            //     }
            //     continue;
            // }

            if (!map.containsKey(curr.hDist)) {
                map.put(curr.hDist, curr.node);
            }

            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hDist - 1));
                min = Math.min(min, curr.hDist - 1);
            }

            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hDist + 1));
                max = Math.max(max, curr.hDist + 1);
            }

        }

        for(int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topView(root);
    }

}
