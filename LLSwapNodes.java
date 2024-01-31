import java.util.List;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
       this.val=val;
    }
}

public class LLSwapNodes {

    public ListNode swapEle(ListNode head,ListNode second){
        int temp;
        temp=head.val;
        head.val=second.val;
        second.val=temp;

        return head;
    }

    public void printLL(ListNode head){
        if(head==null){
           System.out.println("List is empty");
           return;
        }
        ListNode tempNode=head;
        while(tempNode!=null){
           System.out.print(tempNode.val+"->");
           tempNode=tempNode.next;
        }
        System.out.println("null");
     }
  
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);

        LLSwapNodes l1=new LLSwapNodes();

        l1.printLL(head);

        head=l1.swapEle(head, head.next.next);

        l1.printLL(head);
    }
    
}
