public class LinkedList {
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

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (isEmpty(head)) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (isEmpty(head)) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;
        while (i < idx-1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static boolean isEmpty(Node head) {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void printLL(Node head) {
        if (head == null) {
            System.out.println("LL is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 2);

        ll.printLL(head);
        System.out.println("\n" + size);
    }
}
