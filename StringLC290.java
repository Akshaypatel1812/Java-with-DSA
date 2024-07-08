import java.util.ArrayList;
import java.util.*;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class StringLC290 {

    public static boolean wordPattern(String pattern, String s) {
        String [] arr=s.split(" ");
        char [] c=pattern.toCharArray();
        HashMap<String,Integer> list1=new HashMap<>();
        HashMap<Character,Integer> list2=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(list1.containsKey(arr[i])){
               int val=list1.get(arr[i]);
               list1.put(arr[i],val+1);
            }else{
                list1.put(arr[i], 1);
            }
        }

        for(int i=0;i<c.length;i++){
            if(list2.containsKey(c[i])){
                int val1=list2.get(c[i]);
                list2.put(c[i], val1+1);
            }else{
                list2.put(c[i], 1);
            }
        }

        System.out.println(list1);
        System.out.println(list2);

        ArrayList<Integer> ans1=new ArrayList<>(list1.values());
        ArrayList<Integer> ans2=new ArrayList<>(list2.values());

        Collections.sort(ans1);
        Collections.sort(ans2);

        if(ans1.equals(ans2)){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        String pattern="abba";
        String s="cat dog dog cat";

        System.out.println(wordPattern(pattern, s));
    }
}
