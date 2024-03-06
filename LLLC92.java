import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LLLC92 {

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
            ListNode first = dummy;
            ListNode last = dummy;
            int i = 1;
            while (i < left ) {
                first = first.next;
                i++;
            }
            int j = 1;
            while (j < right) {
                last = last.next;
                j++;
            }
            int temp = first.next.val;
            first.next.val = last.next.val;
            last.next.val = temp;

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
        head.next.next=new ListNode(3);
        // head.next.next.next=new ListNode(4);
        // head.next.next.next.next=new ListNode(5);

        printLL(head);
        head = reverseBetween(head, 1, 2);
        printLL(head);
    }
}
