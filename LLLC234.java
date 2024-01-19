class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
    }
}

public class LLLC234 {

    public boolean isPalindrome(ListNode head) {
        //first we find out the mid value
        ListNode midNode=mid(head);

        //reverse the arraylist from its mid value
        ListNode prevNode=null;
        ListNode currNode=midNode;
        while(currNode!=null){
            ListNode nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }

        ListNode rightNode=prevNode;
        ListNode leftNode=head;

        while(rightNode!=null){
            if(leftNode.val!=rightNode.val){
                   return false;
            }

            rightNode=rightNode.next;
            leftNode=leftNode.next;
        }

        return true;
    }

    private static ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        LLLC234 l1=new LLLC234();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(1);
        // head.next.next.next.next=new ListNode(5);

        System.out.println(l1.isPalindrome(head));
    }
}
