class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;

    }
}

public class LL {

    // Reverse Linked List
    public ListNode reverseList(ListNode head) {

        ListNode prev = head;
        ListNode curr = head.next;
        head.next = null;
        while (curr != null) {
            ListNode nextNode = curr.next;
            // break connection with forward node and re-make connection with backward node
            curr.next = prev;

            // increase one step
            prev = curr;
            curr = nextNode;
        }

        // head.next=prev;
        return prev;

    }

    // Print Linked List
    public static void PrintLL(ListNode head) {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        ListNode tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.val + "->");
            tempNode = tempNode.next;

        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        LL l1 = new LL();
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        l1.PrintLL(head);

        head = l1.reverseList(head);

        l1.PrintLL(head);

    }
}
