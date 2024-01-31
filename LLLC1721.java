class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
    }
}

public class LLLC1721 {
    public int getSize(ListNode head) {
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public ListNode swapNodes(ListNode head, int k) {
        int size=getSize(head);
        ListNode StartNode=head;
        ListNode EndNode=head;
        int i=1;
        int j=1;
        while(i<k){
            StartNode=StartNode.next;
            i++;
        }
        while(j<size-k+1){
            EndNode=EndNode.next;
            j++;
        }
        
        int temp=StartNode.val;
        StartNode.val=EndNode.val;
        EndNode.val=temp;

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
       
        LLLC1721 l1=new LLLC1721();

        l1.printLL(head);
        l1.swapNodes(head, 2);
        l1.printLL(head);

    }
}
