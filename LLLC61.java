class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LLLC61 {

    public ListNode rotateRight(ListNode head, int k) {
        int i = 0;
        while (i < k) {
            ListNode SLNode=null;
            ListNode LNode=head;
            while(LNode.next!=null){
                SLNode=LNode;
                LNode=LNode.next;
            }
            SLNode.next=null;
            LNode.next=head;
            head=LNode;
            i++;
        }

        return head;
    }

    public void printLL(ListNode head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        ListNode tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.val + "->");
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        LLLC61 l1 = new LLLC61();

        l1.printLL(head);
        head=l1.rotateRight(head, 2);
        l1.printLL(head);
    }
}
