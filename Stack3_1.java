import java.util.Stack;

public class Stack3_1 {
    public static void addBottom(Stack<Integer> list, int data) {

        if (list.isEmpty()) {
            list.push(data);
            return;
        }
        int top = list.pop();
        addBottom(list, data);
        list.push(top);
    }

    public static void reverseArray(Stack<Integer> list){
        if(list.isEmpty()){
            return ;
        }
        int top=list.pop();
        reverseArray(list);
        addBottom(list, top);

    }
    public static void main(String[] args) {
        Stack3_1 s1=new Stack3_1();
        Stack<Integer>list=new Stack<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);

        System.out.println(list);
        s1.reverseArray(list);
        System.out.println(list);
        
    }
}
