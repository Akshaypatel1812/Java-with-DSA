import java.util.*;

public class StringLC316 {
    public static String removeDuplicateLetters(String s) {
        char min='z';
        int m=0;
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)<min){
            min=s.charAt(i);
            m=i;
           } 
        }
        System.out.println(m);
        System.out.println(min + " " +m);
        LinkedHashSet<Character>list=new LinkedHashSet<>();
        for(int i=m;i<s.length();i++){
            list.add(s.charAt(i));
        }

        StringBuilder str=new StringBuilder();
        for (Character ch : list) {
            str.append(ch);
        }

        String ans=new String(str);
        for(int i=0;i<m;i++){
            if(ans.indexOf(s.charAt(i))<0){
               ans=s.charAt(i)+ans;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(removeDuplicateLetters(s));
    }
}
