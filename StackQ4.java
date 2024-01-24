import java.util.Stack;




public class StackQ4 {

    public static void createspan(int[] stock, int[] span) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stock.length; i++) {
            int currPrice = stock[i];
            while (!s.isEmpty() && currPrice > stock[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;

            }

            s.push(i);
        }

    }

    public static void main(String[] args) {
        int stock[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stock.length];
 
        createspan(stock, span);

        for(int i=0;i<span.length;i++){
            System.out.println(span[i]);
        }
    }
}
