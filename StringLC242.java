import java.util.*;

public class StringLC242 {

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> list = new HashMap<>();
        HashMap<Character, Integer> list2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (list.containsKey(s.charAt(i))) {
                int val = list.get(s.charAt(i));
                list.put(s.charAt(i), val + 1);
            } else {
                list.put(s.charAt(i), 1);
            }

            if (list2.containsKey(t.charAt(i))) {
                int val = list2.get(t.charAt(i));
                list2.put(t.charAt(i), val + 1);
            } else {
                list2.put(t.charAt(i), 1);
            }
        }

        
        if(list.equals(list2)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String temp = "a";
        String temp2 = "ab";

        System.out.println(isAnagram(temp, temp2));

    }
}
