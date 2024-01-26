import java.util.*;
public class StackQ6 {

    public static boolean checkValidString(String s) {
        Stack<Character> list=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;
            if (ch == ')') {
                while(list.peek()!='('){
                list.pop();
                count++;
                }

                if(count<1){
                    return true;
                }
                else{
                    list.pop();
                }
            }
            else{
                list.push(ch);
            }
        }

        return false;

    }

    public static void main(String[] args) {
        String str = "(*)";
        System.out.println(checkValidString(str));
    }
}

