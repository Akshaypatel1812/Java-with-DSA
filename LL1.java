//here we see all operations by using scratch
public class LL1 {
    node head;

    // you can made also tail for better performance & if you dont wont to travel
    // loop.
    public static int size;

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
        int i = 0;
        node tempnode = head;
        while (i < index - 1) {
            tempnode = tempnode.next;
            i++;
        }

        newnode.next = tempnode.next;
        tempnode.next = newnode;
    }

    // delete first
    public void deletefirst() {
        if (size == 0) {
            System.out.println("list is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            size = 0;
        }

        size--;

        head = head.next; // here old head will automatically collect by garbage collector
    }

    // delete last
    public void deletelast() {
        if (size == 0) {
            System.out.println("list is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            size = 0;
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

    // search iteratively

    public int search(int data) {
        node tempNode = head;
        int i=0;
        while (tempNode.next != null) {
            if (tempNode.data == data) {
                return i;
            }
            tempNode=tempNode.next;
            i++;
        }
        return -1;
    }

     // search recursively
     public int searchrecursively(node tempNode,int i,int key){

        if(tempNode.next==null){
            return -1;
        }

        if(tempNode.data == key){
            return i;
        }

        return searchrecursively(tempNode.next,i+1, key);
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

    public static void main(String[] args) {
        LL1 l1 = new LL1();

        l1.addfirst(2);
        l1.addlast(4);
        l1.printLL();
        l1.addfirst(1);
        l1.addmid(3, 2);

        l1.printLL();

        l1.deletefirst();
        l1.printLL();

        l1.deletelast();
        l1.printLL();

        System.out.println(l1.ListSize());

        l1.addfirst(1);
        l1.printLL();
        System.out.println(l1.ListSize());

        l1.deletelast();
        l1.printLL();
        System.out.println(l1.ListSize());

        l1.addlast(4);
        l1.addlast(5);

        l1.addmid(3, 2);
        l1.printLL();
        System.out.println(l1.ListSize());
        
        System.out.println("Your searched index is:"+l1.search(8));

        System.out.println("Your searched index is:"+l1.searchrecursively(l1.head,0,4));
    }
}
