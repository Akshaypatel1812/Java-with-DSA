class ListNode {
    static int size;
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class LC203 {

    // print Linked List
    public static void printLL(ListNode head) {
        if (head == null) {
            System.out.println("List is empty");
        }

        ListNode tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.val + "->");
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }

    public static ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }

        ListNode tempNode=new ListNode(0);
        tempNode.next=head;                        // to connect null to head of original LL
        ListNode prev=tempNode;
        ListNode curr=head;
        while(curr!=null){
            if(curr.val==val){
                prev.next=curr.next;
            }
            else{               // prev=curr required in else because it you put it with out else than prev will stay on deleted node
            prev=curr;
            }
            curr=curr.next;
        }

        return tempNode.next;
    }

    public static void main(String[] args) {
        LC203 l1 = new LC203();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(1);
        // head.next.next.next.next.next.next = new ListNode(6);

        l1.printLL(head);

        head=l1.removeElements(head, 1);

        l1.printLL(head);

    }
}