class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LLLC142 {

    // Cycle detection in Linked List
    public static boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // here we Remove cycle from the Linked List

    // public static void RemoveCycle(ListNode head) {
    // // first we detect the cycle
    // ListNode slow = head;
    // ListNode fast = head;
    // boolean detect = false;
    // while (fast != null && fast.next != null) {
    // slow = slow.next;
    // fast = fast.next.next;
    // if (fast == slow) {
    // detect = true;
    // break;
    // }
    // }

    // if (detect == false) {
    // return;
    // }

    // ListNode prev = null;
    // slow = head;

    // while (slow != fast) {
    // prev = fast;
    // slow = slow.next;
    // fast = fast.next;
    // }

    // prev.next = null;

    // }

    // here we detect the first index of cyclic linked list
    public static ListNode RemoveCycle(ListNode head) {
        // first we detect the cycle
        ListNode slow = head;
        ListNode fast = head;
        boolean detect = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                detect = true;
                break;
            }
        }

        if (detect == false) {
            return null;
        }
        ListNode prev = null;
        slow = head;

        while (slow != fast) {
            prev = fast;            //this prev is prev of fast
            slow = slow.next;
            fast = fast.next;
        }

        // prev.next = null;
        // System.out.println(fast.val);
        return fast;

    }

    public static void main(String[] args) {
        LLLC142 l1 = new LLLC142();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next;

        // System.out.println(l1.hasCycle(head));

        System.out.println(l1.RemoveCycle(head));

        // System.out.println(l1.hasCycle(head));

    }
}
