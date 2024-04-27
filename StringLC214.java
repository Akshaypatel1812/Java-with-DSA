public class StringLC214 {
    public static String shortestPalindrome(String s) {
        int n = s.length();
        
        // Find the longest palindrome prefix
        int i;
        for (i = n - 1; i >= 0; i--) {
            if (isPalindrome(s.substring(0, i + 1))) {
                break;
            }
        }
        
        // Reverse the remaining part and append it to the original string
        StringBuilder sb = new StringBuilder(s.substring(i + 1));
        return sb.reverse().append(s).toString();
    }

    public static boolean isPalindrome(String s){
        if(reverse(s)==s){
            return true;
        }

        return false;
    }

    public static String reverse(String s){
        char [] c=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        
        while(start<end){
            char temp=c[start];
            c[start]=c[end];
            c[end]=temp;

            start++;
            end--;

        }

        String str=c.toString();
        String ans=new String(str);

        return ans;
    }
    public static void main(String[] args) {
        String s="aacecaaa";

        System.out.println(shortestPalindrome(s));
        
    }
}
