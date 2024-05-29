class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LLLC2816 {
    public static ListNode reorder;

    public static ListNode addLast(ListNode reorder, int val) {
        ListNode newNode = new ListNode(val);

        if (reorder == null) {
            reorder = newNode;
            return reorder;
        }
        ListNode tempNode = reorder;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }

        tempNode.next = newNode;
        newNode.next = null;

        return reorder;
    }

    public static ListNode doubleIt(ListNode head) {
        String single = helper(head);
        int dbl = Integer.parseInt(single) * 2;

        String ans = Integer.toString(dbl);
        reorder = null; // Initialize class variable

        for (int i = 0; i < ans.length(); i++) {
            reorder=addLast(reorder, ans.charAt(i) - '0');
        }

        return reorder;
    }

    public static String helper(ListNode head) {
        StringBuilder sbr = new StringBuilder();

        ListNode tempNode = head;
        while (tempNode != null) {
            sbr.append(tempNode.val);
            tempNode = tempNode.next;
        }

        return sbr.toString();
    }

    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        ListNode tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.val + "->");
            tempNode = tempNode.next;
        }

        System.out.println("Null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        printList(head);
        reorder = doubleIt(head);
        printList(reorder);
    }
}
