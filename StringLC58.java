public class StringLC58 {
    public static int lengthOfLastWord(String s) {
        s=s.trim();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
           if(s.charAt(i)==' '){
            return count;
           }
           else{
            count++;
           }
        }

        return count;
    }
    public static void main(String[] args) {
        String s="   fly me   to   the moon  ";
       
        System.out.println(lengthOfLastWord(s));
    }
}
