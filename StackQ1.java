//here wwe add element at the end of the stack

import java.util.Stack;

public class StackQ1 {

    public static void addBottom(Stack<Integer> list, int data) {

        if (list.isEmpty()) {
            list.push(data);
            return;
        }
        int top = list.pop();
        addBottom(list, data);
        list.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(1);
        list.push(2);
        list.push(3);
        
        addBottom(list, 4);

        while(!list.isEmpty()){
             System.out.println(list.pop());
        }
    }
}
