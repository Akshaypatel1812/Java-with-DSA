import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class StringLC1370 {
    public static String sortString(String s) {
        HashSet<Character>list=new HashSet<>();
        char [] c=s.toCharArray();
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<s.length();i++){
            list.add(c[i]);
        }
        
        StringBuilder forward=new StringBuilder();
        StringBuilder reverse=new StringBuilder();
        for (Character ch : list) {
            forward.append(ch);
        }
        
        List<Character> rev = new ArrayList<>(list);

        // Reverse the List
        Collections.reverse(rev);
        for (Character ch : rev) {
            reverse.append(ch);
        }

        while(ans.length()<s.length()){
            ans.append(forward);
            if(ans.length()<s.length())
            ans.append(reverse);
        }
        
        return ans.toString();
    }

    public static void main(String[] args) {
        String s="rat";

        System.out.println(sortString(s));
    }
}
