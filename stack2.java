import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class stack2 {
    static ListNode head = null;


    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isEmpty() {
        return head == null;
    }

    static void push(int val) {
        ListNode newNode = new ListNode(val);
        
        if (head == null) {
            head = newNode;
        }
        newNode.next = head;
        head = newNode;

    }

    public static int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        
        int i = head.val;
        head = head.next;
        return i;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.val;

    }

    public static void main(String[] args) {
        stack2 s1 = new stack2();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());

        System.out.println("Peeked element is:"+s1.peek());

    }
}
