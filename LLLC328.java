class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
       this.val=val;
    }
}

public class LLLC328 {
    static ListNode ans;
    public static ListNode oddEvenList(ListNode head) {
        ans=null;
        ListNode first=head;
        ListNode second=head.next;
        while (first != null) {
            addLast(first.val);
            first = (first.next != null) ? first.next.next : null;
        }

        // Traverse the even nodes next
        while (second != null) {
            addLast(second.val);
            second = (second.next != null) ? second.next.next : null;
        }
        return ans;
    }

    public static void addLast(int val){
        ListNode newNode = new ListNode(val);

        if(ans==null){
           ans=newNode;
           return;
        }

        ListNode temp=ans;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=newNode;
        newNode.next=null;
    }

    public static void printList(ListNode head){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        ListNode tempNode=head;
        while(tempNode!=null){
            System.out.print(tempNode.val+"->");
            tempNode=tempNode.next;
        }

        System.out.println("Null");
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);

        printList(head);

        head=oddEvenList(head);

        printList(head);
    }
}
