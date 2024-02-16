import java.util.LinkedList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LLLC21 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode currNode=dummy;

        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                currNode.next=list1;
                list1=list1.next;
            }

            else{
                currNode.next=list2;
                list2=list2.next;
            }

            currNode=currNode.next;

        }

        if (list1 != null) {
            currNode.next = list1;
        } else {
            currNode.next = list2;
        }

        return dummy.next;
    }

    public static void printLL(ListNode head){
        ListNode currNode=head;
        while(currNode!=null){
            System.out.print(currNode.val+"->");
            currNode=currNode.next;
            
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);

        head = mergeTwoLists(head, head2);

        printLL(head);

    }
}
