import java.util.HashSet;

public class SubseqUnique {

    static void UniqueSubseq(String s, String ans,HashSet<String> set) {
        if (s.isEmpty()) {
            if(set.contains(ans)){
                return ;
            }
            else{
            System.out.println(ans);
            set.add(ans);
            return;
            }
        }

        char c = s.charAt(0);
        UniqueSubseq(s.substring(1), ans,set);

        UniqueSubseq(s.substring(1), ans + c,set);

    }

    public static void main(String[] args) {
        String str = "aaa";
        String ans = "";
        HashSet<String>set=new HashSet<>();
        UniqueSubseq(str, ans,set);
    }
}
