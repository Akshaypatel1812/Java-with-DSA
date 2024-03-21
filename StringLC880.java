public class StringLC880 {
    public static String decodeAtIndex(String s, int k) {
        int num = 0;

        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (k >= sb.length()) {
                int count = 1;
                if (Character.isDigit(c[i])) {
                    num = c[i] - '0';
                    while (count < num) {
                        sb.append(sb);
                        count++;
                    }
                } else {
                    sb.append(c[i]);
                }
            }
        }
        System.out.println(sb);
        char ch = sb.charAt(k - 1);
        String ans = String.valueOf(ch);

        return ans;

    }

    public static void main(String[] args) {
        String str = "leet2code3";

        System.out.println(decodeAtIndex(str, 10));
    }
}
