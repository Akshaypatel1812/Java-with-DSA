public class StringLC557 {
    public static String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        String sa;
        String[] split = s.split("\\s+");
        for (int i = 0; i < split.length; i++) {

            char[] c = split[i].toCharArray();
            int start = 0;
            int end = split[i].length() - 1;
            while (start < end) {
                char temp = c[start];
                c[start] = c[end];
                c[end] = temp;
                start++;
                end--;

            }
            sa = String.valueOf(c);
            ans.append(" ").append(sa);
        }

        return ans.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
