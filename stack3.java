import java.util.Stack;



public class stack3 {
    public static void main(String[] args) {
        Stack <Integer> s1=new Stack<>();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        System.out.println(s1);

        while(!s1.isEmpty()){
            System.out.println(s1.pop());           //last in first out manner
        }
        s1.push(5);
        s1.push(6);
        s1.push(7);
        System.out.println("your peeked element is:"+s1.peek());
    }
}
