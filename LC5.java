public class LC5 {

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static boolean ispalindrome(String str) {
        String reversed = reverseString(str);
        return str.equals(reversed);
        
    }

    public static String longestPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;

        if(start==end){
            return s;
        }

       
        

        while (start < end) {
            if (ispalindrome(s.substring(start, end))) {
                return s.substring(start, end);
            } else {
                start++;
                end--;
            }
        }

        if(s.length()==2){
            char c=s.charAt(start);
            return Character.toString(c);
        }

        return null;
    }

    public static void main(String[] args) {
        String check="babad";
        String a="akshay";
        System.out.println(a.substring(0, a.length()-1));
         System.out.println(longestPalindrome(check));
    }
}
