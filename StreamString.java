public class StreamString {
    static String Stream(String s,String ans,String s2){
        if(s.isEmpty()){
            return ans;
        }
        char ch = s.charAt(0);
        // char ch2=s2.charAt(0);
        if(s.startsWith(s2)){
            return Stream(s.substring(s2.length()),ans,s);   //here begin index is 1 bacause every time new string will with first- 
        }
        else{
            return Stream(s.substring(1),ans+ch,s2);
        }
    }
    
    public static void main(String[] args) {
        String str="pianeapplei";
        String ans="";
        String s2="apple";
        System.out.println(Stream(str,ans,s2));
    }
}
