import java.util.Arrays;

public class StringLC205 {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // char [] a=s.toCharArray();
        // char [] b=s.toCharArray();

        // Arrays.sort(a);
        // Arrays.sort(b);

        // s=a.toString();
        // t=b.toString();

        for (int i = 0; i < s.length()-1; i++) {
            
            if(s.charAt(i)==s.charAt(i+1)){
                if(t.charAt(i)!=t.charAt(i+1)){
                    return false;
                }

            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "paper";
        String t = "title";

        System.out.println(isIsomorphic(s, t));
    }
}
