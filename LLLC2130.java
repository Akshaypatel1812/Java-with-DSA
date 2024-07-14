import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
       this.val=val;
    }
}

public class LLLC2130 {
    static ArrayList<Integer>list=new ArrayList<>();

    public static int dataSum(ListNode head,int first,int second){
         
         ListNode curr=head;

         ListNode p=head;
         ListNode q=head;
         int f=0;
         int s=0;

         while(f<first){
            p=p.next;
            f++;
         }

         while(s<second){
            q=q.next;
            s++;
         }

          return p.val+q.val;
    }

    public static int pairSum(ListNode head) {
        list=new ArrayList<>();
        int index=0;
        int size=size(head);
        while(index<=size/2-1){
           list.add(dataSum(head, index, size-1-index));
           index++;
        }

        return Collections.max(list);
    }

    public static int size(ListNode head){
        ListNode curr=head;
        int count=0;
        while(curr!=null){
           count++;
           curr=curr.next;
        }

        return count;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(10000);
        // head.next.next=new ListNode(2);
        // head.next.next.next=new ListNode(3);

       
        System.out.println(pairSum(head));
    }
}
