class ListNode {
    public ListNode head;
    int val;
    ListNode next;
    ListNode tail;

    ListNode(int val) {
        this.val = val;
       
    }
}

public class queueUsingLL {
    public static ListNode head = null;
    public static ListNode tail = null;

    public boolean isEmpty() {
        if (head == null && tail == null) {
            System.out.println("List is empty");
            return true;
        } else {
            return false;
        }
    }

    public void enQue(int val) {
        ListNode newNode = new ListNode(val);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = tail.next;

    }

    public int Dque() {
        if (isEmpty()) {
            System.out.println("Queue List is empty");
            return -1;
        }
        int front = head.val;
        if (tail == head) {
            tail = head = null;
        } else {
            head = head.next;
        }
        return front;

    }

    public void printLL() {
        ListNode temp = head; // Use a temporary pointer
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        queueUsingLL ql = new queueUsingLL();
        ql.enQue(1);
        ql.enQue(2);
        ql.enQue(3);

        ql.printLL();

        System.out.println(ql.Dque());

    }
}
