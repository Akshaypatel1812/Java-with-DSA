public class StringLC5 {

    public static String longestPalindrome(String s) {
        int max=Integer.MIN_VALUE;
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
               if(isPalindrome(s.substring(i, j)) && s.subSequence(i, j).length()>max){
                 max=s.subSequence(i, j).length();
                 ans=s.substring(i, j);
               }
            }
        }

        return ans;
    }

    public static boolean isPalindrome(String str){
        char [] c=str.toCharArray();
        int start=0;
        int end=str.length()-1;

        while(start<end){
            char tamp=c[start];
            c[start]=c[end];
            c[end]=tamp;

            start++;
            end--;
        }
        
        String rev=new String(c);

        if(str.equalsIgnoreCase(rev)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s="cbbd";

        System.out.println(longestPalindrome(s));
    }
}
