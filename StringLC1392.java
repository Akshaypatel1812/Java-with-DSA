public class StringLC1392 {
    // public static String longestPrefix(String s) {
    // int maxLength=0;
    // String ans="";
    // int end=s.length()-1;
    // String m=s.substring(1,s.length());
    // while(end!=0){
    // String check=s.substring(0,end);
    // if(m.contains(check) && check.length()>maxLength){
    // maxLength=check.length();
    // ans=check;
    // }
    // end--;
    // }

    // return ans;
    // }

    public static String longestPrefix(String s) {
        int maxLength = 0;
        String ans = "";
        // int end = s.length()-1;
        int start=1;

        while(start<s.length() ){
            String prefix=s.substring(0, start);
            String postfix=s.substring(s.length()-start);
            start++;
            
            if(prefix.equals(postfix) && prefix.length()>maxLength){
                maxLength=prefix.length();
                ans=prefix;
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        String s = "ababa";

        System.out.println(longestPrefix(s));
    }
}
