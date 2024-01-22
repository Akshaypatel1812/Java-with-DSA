import java.util.*;

public class StackQ2 {

    // reverse string using stack
    public static String reverse(String str) {
        Stack<Character> list = new Stack<>();
        // String ans="";
        int indxx = 0;
        while (indxx <= str.length()-1) {
            list.push(str.charAt(indxx));
            indxx++;
        }
        String ans="";
        while(!list.isEmpty()){
            String poppedChar =Character.toString(list.pop());
            ans=ans+poppedChar;
        }

        return ans;

    }

    public static void main(String[] args) {
        String str = "JAY SHREE RAM";
        String ans = "";
        System.out.println(reverse(str));
         
    }
}
