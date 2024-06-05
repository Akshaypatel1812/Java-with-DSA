import java.util.ArrayList;
import java.util.Collections;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

}

public class LLLC148 {

    
    public static ListNode sortList(ListNode head) {
        ListNode tempNode = head;
        ArrayList<Integer> list = new ArrayList<>();
        while (tempNode != null) {
            list.add(tempNode.val);
            tempNode = tempNode.next;

        }

        Collections.sort(list);
        tempNode = head;

        int index = 0;
        while (tempNode != null) {
            tempNode.val = list.get(index);
            tempNode=tempNode.next;
            index++;
        }

        return head;
    }

    // print Linked List
    public static void printLL(ListNode head) {
        ListNode tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.val + "->");
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LLLC148 l1 = new LLLC148();
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        l1.printLL(head);

        head=l1.sortList(head);

        l1.printLL(head);

    }
}
