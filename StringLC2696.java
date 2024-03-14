public class StringLC2696 {

    public static int minLength(String s) {
        if(s.contains("AB")){
            s=s.replace("AB", "");
        }
        if(s.contains("CD")){
            s=s.replace("CD", "");
        }
        
        if(s.contains("AB") || s.contains("CD")){
            return minLength(s);
        } 
        else{
            return s.length();
        }   
    }
    public static void main(String[] args) {
        String str="ACBBD";
        System.out.println(minLength(str));
    }
}
