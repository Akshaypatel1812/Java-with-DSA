public class Stream {
    static String Stream(String s,String ans){
        if(s.isEmpty()){
            return ans;
        }
        char ch = s.charAt(0);
        if(ch=='a'){
            return Stream(s.substring(1),ans);   //here begin index is 1 bacause every time new string will with first- 
        }
        else{
            return Stream(s.substring(1),ans+ch);
        }
    }
    public static void main(String[] args) {
        String str="akshay";
        String ans="";
        System.out.println(Stream(str,ans));
    }
}
