import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LLLC141 {

    //Cycle detection in Linked List
    public boolean hasCycle(ListNode head){

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
             if(slow==fast){
                return true;
             }
        }
         
        return false;
    }
    public static void main(String[] args) {
        LLLC141 l1=new LLLC141();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        // head.next.next.next=head;

        System.out.println(l1.hasCycle(head));

    }

}
