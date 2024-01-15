//

public class LLQ1 {
    node head;
    public static int size;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(int data) {
        node newNode = new node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // print Linkedlist
    public void printLL() {
        if (head == null) {
            System.out.println("List is empty:");
        }
        node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }

    public void removefromlastindex(int indexFromLast) {
         node tempNode=head;
         node nextNode=tempNode.next;
         int i=1;
         while(i<size-indexFromLast){
             tempNode=tempNode.next;
             nextNode=nextNode.next;
             i++;
         }
         tempNode.next=nextNode.next;   
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        LLQ1 l1 = new LLQ1();
        l1.addfirst(8);
        l1.addfirst(7);
        l1.addfirst(6);
        l1.addfirst(5);
        l1.addfirst(4);
        l1.addfirst(3);
        l1.addfirst(2);
        l1.addfirst(1);

        l1.printLL();

        System.out.println(l1.size());

        l1.removefromlastindex(3);
        l1.printLL();
       

    }
}
