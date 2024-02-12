import java.util.HashSet;
import java.util.LinkedHashSet;

public class StringOLC3 {
    public static int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < c.length; i++) {
            set.add(c[i]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : set) {
            stringBuilder.append(ch);
        }

        String ans = stringBuilder.toString();
        System.out.println(ans);
        int num=helper(ans, s);
        int num2=helper(ans, s);
        return Math.max(num, num2);
        
    }

    public static int helper(String ans,String s){
        if(ans.length()==0){
            return 0;
        }
        if(s.contains(ans)){
            return ans.length();
        }
        return helper(ans.substring(1), s);
        
        
    }

    public static int helper2(String ans,String s){
        if(ans.length()==0){
            return 0;
        }
        if(s.contains(ans)){
            return ans.length();
        }
        return helper(ans.substring(0, ans.length()-2), s);
        
        
    }

    public static void main(String[] args) {
        String str = "dvdf";

        System.out.println(lengthOfLongestSubstring(str));
    }
}
