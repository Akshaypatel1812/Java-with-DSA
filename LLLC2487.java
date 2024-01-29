class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LLLC2487 {

    public void printLL(ListNode head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        ListNode tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.val + "->");
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }

    public ListNode removeNodes(ListNode head) {
        ListNode tempNode = new ListNode(0);
        tempNode.next = head; // to connect null to head of original LL
        ListNode prev = tempNode;
        ListNode curr = head;
    
        while (curr != null) {
            ListNode nextNode = curr.next;
            if (nextNode != null && curr.val < nextNode.val) {
                prev.next = nextNode;
                curr = tempNode.next; // Reset current to the beginning of the list
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
    
        return tempNode.next;
    }
    

    public static void main(String[] args) {
        LLLC2487 l1 = new LLLC2487();
        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(8);

        l1.printLL(head);
        head = l1.removeNodes(head);
        l1.printLL(head);

    }
}
