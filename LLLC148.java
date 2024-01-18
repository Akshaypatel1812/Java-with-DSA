class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

}

public class LLLC148 {

    // Sort LinkList by using mergesort
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // first we find mid node
        ListNode midNode = getmid(head);
       
        ListNode right=midNode.next;
        midNode.next = null;
        // second we devide list in parts like left and right
        ListNode newleft = sortList(head);
        ListNode newright = sortList(right);

        // merge list in sorted manner
        return merge(newleft, newright);

    }

    private static ListNode getmid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next; // if we want prev mid element in the case of even nodes

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private static ListNode merge(ListNode first, ListNode second) {
        ListNode mergeLL = new ListNode(-1);
        ListNode tempNode = mergeLL;

        while (first != null && second != null) {
            if (first.val <= second.val) {
                tempNode.next = first;
                tempNode = tempNode.next;
                first = first.next;

            } else {
                tempNode.next= second;
                tempNode = tempNode.next;
                second = second.next;
            }
        }

        while (first != null) {
            tempNode.next = first;
            tempNode = tempNode.next;
            first = first.next;
        }

        while (second != null) {
            tempNode.next = second;
            tempNode = tempNode.next;
            second = second.next;

        }

        return mergeLL.next;

    }

    // print Linked List
    public static void printLL(ListNode head) {
        ListNode tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.val + "->");
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LLLC148 l1 = new LLLC148();
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        l1.printLL(head);

        l1.sortList(head);

        l1.printLL(head);

    }
}
