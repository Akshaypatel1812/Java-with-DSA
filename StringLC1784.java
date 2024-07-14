public class StringLC1784 {
    public static boolean checkOnesSegment(String s) {
        int i=0;
        int count=0;
        while(i<s.length()){
            
            char curr=s.charAt(i);
            count++;
            if(count>2){
                return false;
            }
            while(i<s.length() && s.charAt(i)==curr){
                i++;
            }


        }

        return true;
    }
    public static void main(String[] args) {
        String s="0011001";

        System.out.println(checkOnesSegment(s));
    }
}
