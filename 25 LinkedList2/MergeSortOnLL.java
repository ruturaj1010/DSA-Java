public class MergeSortOnLL {
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
    public static int size;

    public void addLast(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void printLL() {
        if(head == null) {
            System.out.println("null");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    private Node getMidNode(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private Node mergell(Node lefthead, Node righthead){
        Node mergeHead = new Node(-1);
        Node temp = mergeHead;
        while (lefthead != null && righthead != null) {
            if(lefthead.data <= righthead.data) {
                temp.next = lefthead;
                lefthead = lefthead.next;
            }else {
                temp.next = righthead;
                righthead = righthead.next;
            }
            temp = temp.next;
        }
        
        while (lefthead != null) {
            temp.next = lefthead;
            lefthead = lefthead.next;
            temp = temp.next;
        }
        
        while (righthead != null) {
            temp.next = righthead;
            righthead = righthead.next;
            temp = temp.next;
        }
        
        return mergeHead.next;
    }
    public Node mergeSortll(Node head) {
        if(head == null ||head.next == null) {
            return head;
        }
        // get the mid
        Node mid = getMidNode(head);
        // perform mergesort on left and right part
        Node rightHead = mid.next;
        mid.next = null;

        Node newleftHead = mergeSortll(head);
        Node newrightHead = mergeSortll(rightHead);

        // perform merge
        Node mergeLLHead = mergell(newleftHead, newrightHead);

        return mergeLLHead;
    }
    
    public static void main(String[] args) {
        MergeSortOnLL ll = new MergeSortOnLL();
        ll.addLast(8);
        ll.addLast(3);
        ll.addLast(6);
        ll.addLast(4);
        ll.addLast(2);
        ll.addLast(5);

        ll.printLL();

        head = ll.mergeSortll(head);
        ll.printLL();

    }
}
