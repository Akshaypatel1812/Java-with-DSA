public class SubseqStringASCII {

    static void StringWithASCII(String s,String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return ;
        }
        char c=s.charAt(0);
        StringWithASCII(s.substring(1), ans+c);
        StringWithASCII(s.substring(1), ans);
        StringWithASCII(s.substring(1), ans+(c+0));
        
    }
    public static void main(String[] args) {
        String str="abc";
        String ans="";
        StringWithASCII(str,ans);
    }
}
