class ListNode{
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int val){
       this.val=val;
       this.next=null;
       this.prev=null;
    } 
}

public class LL3 {
    public static ListNode head;
    public static ListNode tail;
    public static int size;

    //add first in doublyLL
    public void addfirst(int val){
        ListNode newNode=new ListNode(val);
        size++;
        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head.prev=newNode;
        head=newNode;

    }

    //add last
    public void addlast(int val){
        ListNode newNode=new ListNode(val);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        ListNode tempNode=head;
        while(tempNode.next!=null){
            tempNode=tempNode.next;
        }

        tempNode.next=newNode;
        newNode.next=null;
        newNode.prev=tempNode;

    }


    //remove last
    public void removelast(int val){
        ListNode newNode=new ListNode(val);
        if(head==null){
            head=newNode;
        }

        ListNode tempNode=head;
        while(tempNode.next.next!=null){
            tempNode=tempNode.next;
        }
        tempNode.next=null;
        // System.out.println(tempNode.val);

    }

    //remove first
    public void removefirst(){
        if(head==null){
            System.out.println("Link list is empty");
            return ;
        }

        ListNode tempNode=head.next;
        tempNode.prev=null;
        head=tempNode;
    }

    //print LinkList
    public void printLL(){
        if(head==null){
            System.out.println("link list is empty");
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
        LL3 l1=new LL3();
        l1.addfirst(5);
        l1.addfirst(4);
        l1.addfirst(3);
        l1.addfirst(2);
        l1.addfirst(1);

        l1.printLL();

        l1.removefirst();

        l1.printLL();

        l1.removelast(size);

        l1.printLL();

        l1.addlast(6);

        l1.printLL();


    }
}
