public class StringLC1544 {

    public static String makeGood(String s) {
        int k=0;
        while (k <= s.length()) {
            for (int i = 1; i < s.length()-2; i++) {
                char ch = s.charAt(i);
                if (Character.isUpperCase(ch)) {
                    char lc = Character.toLowerCase(ch);
                    if (lc == s.charAt(i + 1)) {
                        s = s.substring(0, i) + s.substring(i + 2);
                    } else {
                        if (lc == s.charAt(i - 1)) {
                            // String rb = new String(new char[] { lc, ch });
                            // s.replace(rb, "");

                            s = s.substring(0, i - 1) + s.substring(i + 1);
                        } else {

                        }
                    }

                }
            }
            k++;
        }

        return s;
    }

    public static void main(String[] args) {
        String s = "abBAcC";

        System.out.println(makeGood(s));

    }
}
