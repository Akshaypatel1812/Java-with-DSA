class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LLLC24 {
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
    
        ListNode prev = dummy;
        ListNode currNode = prev.next;  // currentNode becomes first node of pair
    
        while (currNode != null && currNode.next != null) {
            ListNode nextNode = currNode.next;  // nextNode becomes second node
    
            // Swap pointers (without temporary isolation)
            prev.next = nextNode;
            currNode.next = nextNode.next;
            nextNode.next = currNode;
    
            // Move pointers for the next pair
            prev = prev.next.next;
            currNode = prev != null ? prev.next : null;  // Handle odd nodes
        }
    
        // Handle the last node if the list has an odd number of nodes
        if (currNode != null) {
            prev.next = currNode;
        }
    
        return dummy.next;
    }
    

    public static void printLL(ListNode head) {
        ListNode currNode = head;
        while (currNode != null) {
            System.out.print(currNode.val + "->");
            currNode = currNode.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        printLL(head);
        head=swapPairs(head);
        printLL(head);

    }
}
