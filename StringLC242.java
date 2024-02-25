import java.util.*;

public class StringLC242 {

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int [] one=new int[s.length()];
        int [] two=new int[t.length()];
        for(int i=0;i<s.length();i++){
            one[i]=s.charAt(i);
            two[i]=t.charAt(i);
        }

        Arrays.sort(one);
        Arrays.sort(two);
        if(Arrays.equals(one, two)){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        String temp="rat";
        String temp2="car";
        
        
        System.out.println(isAnagram(temp, temp2));


    }
}
