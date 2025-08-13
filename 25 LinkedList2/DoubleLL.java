public class DoubleLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        size++;
        tail = newNode;
    }

    public void removeFirst() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        if(head.next == null) {
            head = tail = null;
            size--;
            return;
        }

        head = head.next;
        head.prev = null;
        size--;
    }

    public void removeLast() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        if(head.next == null) {
            head = tail = null;
            size--;
            return;
        }

        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null\n");

        Node temp1 = tail;
        while (temp1 != null) {
            System.out.print(temp1.data + " -> ");
            temp1 = temp1.prev;
        }
        System.out.print("null\n");
    }

    public void reverseDLL(){
        if(head == null || head.next == null) {
            return;
        }

        tail = head;

        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next; 
        }
        head = prev;
    }

    public static void main(String[] args) {
        DoubleLL ll = new DoubleLL();

        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.removeFirst();
        ll.removeLast();

        ll.printLL();
        ll.reverseDLL();
        ll.printLL();
        System.out.println(size);
    }
}
