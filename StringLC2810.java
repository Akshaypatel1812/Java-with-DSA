public class StringLC2810 {
    // public static String reverseString(String s){
    //     char [] c=s.toCharArray();
    //     int start=0;
    //     int end=s.length()-1;
    //     while(start<end){
    //         char temp=c[start];
    //         c[start]=c[end];
    //         c[end]=temp;

    //         start++;
    //         end--;
    //     }

        
    //     return ans;

    // }
    public static String finalString(String s) {
        StringBuilder ans=new StringBuilder();
        for(int j=0;j<s.length();j++){
           if(s.charAt(j)=='i'){
                ans.reverse();
           }
           else{
             ans.append(s.charAt(j));
           }
        }
        String str=new String(ans);

        return str;
        
    }
    public static void main(String[] args) {
        String s="string";
        
        System.out.println(finalString(s));
    }
}
