public class LC9 {
    public static boolean isPalindrome(int x) {

        String str = Integer.toString(x);
        char[] c = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
        String strFromCharArray = new String(c);

        if (strFromCharArray.equals(str)) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        int num = -121;
        System.out.println(isPalindrome(num));
    }
}
