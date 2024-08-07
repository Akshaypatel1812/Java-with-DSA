public class LLreverse {
    node head;
    int size = 0;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // add-first
    public void addfirst(int data) {
        node newnode = new node(data);
        size++;
        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    // add-last
    public void addlast(int data) {
        node newnode = new node(data);
        size++;
        if (head == null) {
            head = newnode;
            return;
        }

        node tempnode = head;
        while (tempnode.next != null) {
            tempnode = tempnode.next;

        }
        tempnode.next = newnode;

    }

    // add-mid
    public void addmid(int data, int index) {
        node newnode = new node(data);
        size++;
        if (head == null) {
            head = newnode;
            return;
        }
        int i = 1;
        node tempnode = head;
        while (i != index) {
            tempnode = tempnode.next;
            i++;
        }

        newnode.next = tempnode.next;
        tempnode.next = newnode;
    }

    // delete first
    public void deletefirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        size--;

        head = head.next; // here old head will automatically collect by garbage collector
    }

    // delete last
    public void deletelast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        if (head.next == null) {
            head = null;
        }

        size--;

        node tempforsecondlast = head;
        node tempforlast = head.next;
        while (tempforlast.next != null) {
            tempforsecondlast = tempforsecondlast.next;
            tempforlast = tempforlast.next;
        }

        tempforsecondlast.next = null;

    }

    // size of the array list
    public int ListSize() {
        return size;
    }

    // print linked list

    public void printLL() {

        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        node tempnode = head;
        while (tempnode != null) {
            System.out.print(tempnode.data + "->");
            tempnode = tempnode.next;
        }

        System.out.println("NULL");

    }

    // reverse link list
    public void reverselistIteration() {
        if (head == null || head.next == null) {
            return;
        }
        node prevNode = head;
        node currNOde = head.next;

        while (currNOde != null) {
            node nextNode = currNOde.next;
            currNOde.next = prevNode;
            // upade LL
            prevNode = currNOde;
            currNOde = nextNode;
        }

        head.next = null;
        head = prevNode;
    }

    public node reverselistRecursion(node head){
        if (head == null || head.next == null) {
            return head;
        }

        node newHead=reverselistRecursion(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;

    }

    public static void main(String[] args) {
        LLreverse l1 = new LLreverse();

        l1.addfirst(2);
        l1.addlast(4);

        l1.addfirst(1);
        l1.addmid(3, 2);

        l1.printLL();

        l1.reverselistIteration();
        l1.printLL();

        l1.head=l1.reverselistRecursion(l1.head);
        l1.printLL();



    }
}
