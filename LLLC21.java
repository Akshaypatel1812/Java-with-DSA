import java.util.List;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
    }
}

public class LLLC21 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode currNode=list1;
        ListNode currNode2=list2;

        if(currNode.val<currNode2.val){
            
        }

    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(4);

        ListNode head2=new ListNode(1);
        head2.next=new ListNode(3);
        head2.next.next=new ListNode(4);

        head=mergeTwoLists(head, head2);
    }
}
