import java.util.Arrays;

public class StringLC383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        char [] one=ransomNote.toCharArray();
        char [] two=magazine.toCharArray();
        Arrays.sort(one);
        Arrays.sort(two);
        ransomNote=new String(one);
        magazine=new String(two);
        int i=0;
        int j=0;
        while (i < one.length && j < two.length) {
            if (one[i] == two[j]) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        if(i<ransomNote.length()){
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        String ransomNote = "aab";
        String magazine = "baa";

        System.out.println(canConstruct(ransomNote, magazine));
    }
}
