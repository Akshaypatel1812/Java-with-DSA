import java.util.*;

public class StringLC205 {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> list = new HashMap<>();
        HashMap<Character, Character> list2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (list.containsKey(s.charAt(i))) {
                char c = list.get(s.charAt(i));
                if (c == t.charAt(i)) {

                } else {
                    return false;
                }
            } else {
                list.put(s.charAt(i), t.charAt(i));
            }

            if (list2.containsKey(t.charAt(i))) {
                char d = list2.get(t.charAt(i));
                if (d == s.charAt(i)) {

                } else {
                    return false;
                }
            } else {
                list2.put(t.charAt(i), s.charAt(i));
            }
        }

        System.out.println(list);
        System.out.println(list2);

        return true;
    }

    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";

        System.out.println(isIsomorphic(s, t));
    }
}
