class ListNode{
   
    int val;
    ListNode next;
    ListNode(int val){
       this.val=val;
       this.next=null;
    }
 }

public class LLLC237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;                  // it means at oout node index we assign value of next index 
        node.next = node.next.next;                //then remove connection
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
        LLLC237 l1=new LLLC237();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        l1.printLL(head);
        l1.deleteNode(head.next.next);
        l1.printLL(head);
    }
}
