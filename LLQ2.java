//here we cherck linked in is palingdrome or not 

public class LLQ2 {
    node head;

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
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // lets find out the mid element of linkedlist

    public node mid() {
        // here we use slow fast approach
        node slow = head;
        node fast = head;

        if (head == null || head.next == null) {
            return head;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;
    }

    public boolean check() {
        if (head == null || head.next == null) {
            return true;
        }
        // step-1 find the mid element
        node midNode = mid();

        // step-2 reverse the 2nd half of LL
        node prevNode = null;
        node currNode = midNode;

        while (currNode != null) {
            node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;

        }

        node right = prevNode;
        node left = head;

        // step-3 fetch the ralavent data to check palingdrome or not
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;

    }

    // print arraylist
    public void printarraylist() {
        node tempNode = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        while (tempNode != null) {
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        LLQ2 l1 = new LLQ2();
        l1.addfirst(4);
        l1.addfirst(1);
        l1.addfirst(2);
        l1.addfirst(2);
        l1.addfirst(1);
        l1.addfirst(4);

        l1.printarraylist();
        
        System.out.println(l1.check());
        

    }
}
