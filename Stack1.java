import java.util.ArrayList;

public class Stack1 {

    static class stack {
        static ArrayList<Integer> list = new ArrayList<>();
        static int size=0;
        // push in stack
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int val) {
            
            list.add(val);
            size++;
        }

        public static int pop() {
            int top = list.get(list.size() - 1);
            list.remove(list.size()-1);
            size--;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("list is empty");
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        stack s1 = new stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        
        while(s1.size>=1){                       //pop to remove from top elements in stack
             System.out.println(s1.pop());
        }
        
        // System.out.println(s1.peek());
    }
}
