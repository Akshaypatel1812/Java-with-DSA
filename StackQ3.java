import java.util.Stack;

public class StackQ3 {

    public static void reverse(Stack<Integer> list) {
        Stack<Integer> ans = new Stack<>();

        while (!list.isEmpty()) {
            ans.push(list.pop());

        }

        System.out.println(ans);

    }

    public static void main(String[] args) {
        StackQ3 s=new StackQ3();
        Stack<Integer> list = new Stack<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
     
        s.reverse(list);
        
    }
}
