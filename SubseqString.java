public class SubseqString {

    static void subseq(String s,String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return ;
        }

        char c=s.charAt(0);
        subseq(s.substring(1), ans+c);
        subseq(s.substring(1), ans);
    }
    public static void main(String[] args) {
        String s="abc";
        String ans="";
        subseq(s, ans);
    }
}
