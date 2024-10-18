public class StringLC214 {
    public static String shortestPalindrome(String s) {
        if (isPalindrome(s)) {
            return s;
        }

        for (int i = s.length() - 1; i > 0; i--) {
            String add = s.substring(i);

            String check = new StringBuilder(add).reverse().toString() + s;
            if (isPalindrome(check)) {
                return check;
            }
        }

        return "";
    }

    public static boolean isPalindrome(String s) {
        String rev = reverse(s);

        if (s.equals(rev)) {
            return true;
        }

        return false;
    }

    public static String reverse(String s) {
        char[] c = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;

            start++;
            end--;

        }

        String ans = new String(c);

        return ans;
    }

    public static void main(String[] args) {
        String s = "abcd";

        System.out.println(shortestPalindrome(s));

    }
}
