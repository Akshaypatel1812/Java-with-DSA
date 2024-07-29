import java.util.*;

public class StringLC819 {

    public static String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> list = new HashMap<>();
        Set<String> ban = new HashSet<>();
        String ans = paragraph.replaceAll("[^a-zA-Z0-9\\\\s]", " ");
        ans = ans.replaceAll("\\s+", " ").trim();
        ans = ans.toLowerCase();
        String[] str = ans.split(" ");

        for (int k = 0; k < banned.length; k++) {
            ban.add(banned[k]);
        }

        for (int i = 0; i < str.length; i++) {
            if (!ban.contains(str[i])) {
                if (list.containsKey(str[i])) {
                    int val = list.get(str[i]);
                    list.put(str[i], val + 1);
                } else {
                    list.put(str[i], 1);
                }
            }
        }

        int max = Integer.MIN_VALUE;
        String ret = "";
        for (Map.Entry<String, Integer> entry : list.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                ret = entry.getKey();
            }
        }

        return ret;

    }

    public static void main(String[] args) {
        String s = "Bob!";
        String[] ban = { "hit" };

        System.out.println(mostCommonWord(s, ban));

    }
}
