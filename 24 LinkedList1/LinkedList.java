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
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (isEmpty(head)) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {

        if (isEmpty(head)) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node temp = head;

        // this is also easy to understand the looping concept
        // for (int i = 0; i < size-2; i++) {
        // temp = temp.next;
        // }

        while (temp.next != tail) {
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
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
        System.out.println();
    }

    public int itrSearch(int key) { // O(n)
        if (isEmpty(head)) {
            return -1;
        }

        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public int recHelper(Node head, int key) { // O(n)
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = recHelper(head.next, key);

        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }
    public void recSearch(int key) {
        System.out.println(recHelper(head, key));
        return;
    }

    public void reverseLL() {
        if (head == null || head.next == null) {
            return;
        }

        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthFromEnd(int n) {

        if(head ==  null) {
            System.out.println("List is empty.");
            return;
        }

        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n > sz) {
            System.out.println("ll is smaller");
            return;
        }

        if( n == sz) {
            head = head.next;
            return;
        }

        Node prev = null;
        Node curr = head;
        for(int i=1; i < (sz-n)+1; i++) {
            prev = curr;
            curr = prev.next;
        }
        prev.next = curr.next;
    }

    public Node findMidLL() {
        if (head == null) {
            return null;
        }

        if (head.next == null ){
            return head;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public void checkPalindromeLL() {

        if ( head == null ) {
            System.out.println("ispalindrome for LL is empty");
            return;
        }
        if(head.next == null) {
            System.out.println("LL is palindrome");
            return;
        }

        // Step 1 - find mid
        Node mid = findMidLL();

        // step 2 - reverse half of LL
        Node prev = null; 
        Node curr = mid;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node righthead = prev;

        // step 3 - travel 1st and 2nd half
        Node lefthead = head;

        while (righthead != null) {
            if (lefthead.data != righthead.data) {
                System.out.println("LL is Not palindrome");
                return;
            }
            righthead = righthead.next;
            lefthead = lefthead.next;
        }

        System.out.println("LL is palindrome");
        return;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(4, 5);

        ll.printLL(head);
        // System.out.println(size);
        // ll.removeFirst();
        // ll.removeLast();
        // ll.printLL(head);

        // if (ll.itrSearch(3) != -1) {
        // System.out.println("Key found at index "+ ll.itrSearch(3));
        // } else {
        // System.out.println("Key not found");
        // }

        // ll.recSearch(4);
        // ll.recSearch(10);

        // ll.reverseLL();
        // ll.printLL(head);

        // ll.deleteNthFromEnd(5);
        // ll.printLL(head);

        ll.checkPalindromeLL();

    }
}
