public class usingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int ele = head.data;

        if (tail == head) {
            tail = head = null;
        } else {
            head = head.next;
        }

        return ele;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        usingLinkedList Q = new usingLinkedList();
        Q.add(1);
        Q.add(2);
        Q.remove();
        Q.add(3);
        Q.remove();
        Q.add(4);

        while (!Q.isEmpty()) {
            System.out.println(Q.peek());
            Q.remove();
        }
    }
}
