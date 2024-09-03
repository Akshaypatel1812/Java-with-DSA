public class ArrayLC1961 {
    public static boolean isPrefixString(String s, String[] words) {
        String n = new String();
        for(int i=0;i<words.length;i++){
            n=n+words[i];
            if(n.equals(s))
            {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String s="a";

        String [] words={"aa","aaaa","banana"};

        System.out.println(isPrefixString(s, words));
    }
}
