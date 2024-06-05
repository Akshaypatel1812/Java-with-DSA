import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.events.Characters;

public class StringLC1002 {

    public static List<String> commonChars(String[] words) {
        char[] c = words[0].toCharArray();
        ArrayList<String>list=new ArrayList<>();
        int j=0;
        boolean che = true;
        int index = 0;
        while (index < words[0].length()) {
            for (int i = 1; i < words.length; i++) {
                if (words[i].indexOf(words[0].charAt(j)) >= 0) {
                    che = true;
                } else {
                    che = false;
                }
                j++;
            }
            if (che == true) {
                list.add(words[0].substring(index, index+1));
            }
            index++;
        }

        return list;
    }

    public static void main(String[] args) {
        String[] s = { "bella", "label", "roller" };

        System.out.println(commonChars(s));

    }
}
