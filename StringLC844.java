public class StringLC844 {

    public static boolean backspaceCompare(String s, String t) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(sb1.isEmpty()){

                }else{
                  sb1.deleteCharAt(sb1.length()-1);
                }
                continue;
            }else{
            sb1.append(s.charAt(i));
            }
        }

        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(sb2.isEmpty()){

                }else{
                  sb2.deleteCharAt(sb2.length()-1);
                }
                continue;
            }else{
            sb2.append(t.charAt(i));
            }
        }

        String ans1=sb1.toString();
        String ans2=sb2.toString();
        if(ans1.equals(ans2)){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        String s="a##c";
        String t="#a#c";
    
        System.out.println(backspaceCompare(s, t));
    }

}
