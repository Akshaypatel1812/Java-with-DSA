import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}

public class LLLC2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            current.next = new ListNode(sum % 10);
            carry = sum / 10;
            current = current.next;
        }
        
        return dummy.next;
    }
    
    public static void main(String[] args) {
        ListNode root=new ListNode(1);
        root.next=new ListNode(7);
        root.next.next=new ListNode(5);

        ListNode root2=new ListNode(5);
        root2.next=new ListNode(6);
        root2.next.next=new ListNode(7);

        addTwoNumbers(root, root2);
        
    }
}
