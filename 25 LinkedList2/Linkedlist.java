public class Linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        size++;
        tail = newNode;
    }

    public void printll() {
        if (head == null) {
            System.out.println("null");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public void detectCyclell() {
        if (head == null || head.next == null) {
            System.out.println("Not a cycle");
            return;
        }

        Node slow = head;
        Node fast = head.next;
        while (fast.next != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("IS a cycle");
                return;
            }
        }

        System.out.println("NOT a cycle");
        return;
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        ll.printll();

        // tail.next = head;
        // ll.detectCyclell();

    }
}
