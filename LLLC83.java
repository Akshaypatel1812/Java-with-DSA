import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

}

public class LLLC83 {

    

    // function of remove duplicates

    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null && head.next==null){
            return head;
        }
        ListNode currNode = head;
        while (currNode.next != null) {
           
           if(currNode.val==currNode.next.val){
            currNode.next=currNode.next.next;
           }

           else{
            currNode=currNode.next;
           } 
        }

        return head;
    }

    // print Link list
    public static void printLL(ListNode head) {
        ListNode tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.val + "->");
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LLLC83 l1 = new LLLC83();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        // head.next.next.next = new ListNode(2);
        // head.next.next.next.next = new ListNode(2);
        // head.next.next.next.next.next = new ListNode(4);

        l1.printLL(head);

        head = l1.deleteDuplicates(head);
        l1.printLL(head);

    }
}
