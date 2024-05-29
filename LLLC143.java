class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LLLC143 {

    // Function to find the middle of the linked list
    public static ListNode midNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Function to reverse a linked list
    public static ListNode revHalfList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Function to reorder the linked list
    public static ListNode reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find the middle of the linked list
        ListNode middle = midNode(head);
        ListNode secondHalf = middle.next;
        middle.next = null; // Split the list into two halves

        // Reverse the second half of the linked list
        secondHalf = revHalfList(secondHalf);

        // Merge the two halves
        ListNode firstHalf = head;
        while (firstHalf != null && secondHalf != null) {
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = temp1;

            firstHalf = temp1;
            secondHalf = temp2;
        }

        return head;
    }

    // Function to print the linked list
    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        ListNode tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.val + " ");
            tempNode = tempNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        printList(head);

        reorderList(head);

        System.out.println("Reordered list:");
        printList(head);
    }
}
