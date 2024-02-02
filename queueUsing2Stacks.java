import java.util.*;

public class queueUsing2Stacks {

    static class Queue {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            if (s1.isEmpty()) {
                return true;
            }
            return false;
        }

        public void addque(int data) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public int remove() {
            if (s1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return s1.pop();
        }

        public int peek(){
            if (s1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
           Queue q=new Queue();
           q.addque(2);
           q.addque(3);
           q.addque(4);

           while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
           }
    }
}
