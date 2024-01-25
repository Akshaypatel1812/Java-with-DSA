import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LLCQ1019 {
    static int size=5;

    public static int[] nextLargerNodes(ListNode head) {
        int size= getSize(head);
        int [] ans=new int[size];
        int i = 0;
       
        ListNode currNode = head;
        ListNode currNode2 = head;
        while (currNode2.next != null) {
            int big=0;
            ListNode nextNode = currNode2.next;
            ListNode nextNode2 = currNode2.next;
            currNode = currNode2;
            while (nextNode != null) {
                if (currNode.val < nextNode.val) {
                   big=nextNode.val;
                   break;
                } 
                currNode = currNode.next;
                nextNode = nextNode.next;
            }
            ans[i++]=big;
            currNode2 = currNode2.next;
            nextNode2 = currNode2.next;

        }

        return ans;

    }

    private static int getSize(ListNode head) {
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    // public static int[] nextLargerNodes(ListNode head) {
    //     int[] ans = new int[5];
    //     int i = 0;
        
    //     ListNode currNode = head;
    
    //     while (currNode != null) {
    //         int big = 0; // Reset big for each node
    //         ListNode nextNode = currNode.next;
    
    //         while (nextNode != null) {
    //             if (currNode.val < nextNode.val) {
    //                 big = nextNode.val;
    //                 break; // Break once a greater node is found
    //             }
    //             nextNode = nextNode.next;
    //         }
    
    //         ans[i++] = big;
    //         currNode = currNode.next;
    //     }
    
    //     return ans;
    // }
    

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(5);
        // head.next.next.next = new ListNode(3);
        // head.next.next.next.next = new ListNode(5);

        int [] ans=nextLargerNodes(head);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+",");
        }

    }
}
