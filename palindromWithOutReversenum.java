public class palindromWithOutReversenum {

    static boolean ispalindrom(int num) {
        String s = Integer.toString(num);
        char[] a = s.toCharArray();

        int start = 0;
        int end = a.length - 1;

        while (start < end) {
            if (a[start] != a[end]) {
                return false;
            }

            start++;
            end--;
            
        }
        return true;
    }

    public static void main(String[] args) {
          int n=125321;
          System.out.println(ispalindrom(n));
    }
}
