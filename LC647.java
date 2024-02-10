import java.util.ArrayList;

public class LC647 {

    

    

    public static String reverseString(String str,int left,int right) {
        char[] charArray = str.toCharArray();
      
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

    public static boolean isPalindrome(String check,int left,int right){
        String rev=reverseString(check,left,right);
        if(rev.equals(check)){
            return true;
        }
        else{
            return false;
        }
    }

    public static int countSubstrings(String s) {
        int ans = 0;
        int n = s.length();
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                if(isPalindrome(s, i, j)) ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String a="aba";
        System.out.println(countSubstrings(a));
    }
}
