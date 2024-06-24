import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArrayLC383 {
    // public static boolean canConstruct(String ransomNote, String magazine) {
    //     HashMap<Character,Integer>list1=new HashMap<>();

    //     HashMap<Character,Integer>list2=new HashMap<>();
    //     for(int i=0;i<ransomNote.length();i++){
    //        if(list1.containsKey(ransomNote.charAt(i))){
    //           int occ=list1.get(ransomNote.charAt(i));
    //           list1.put(ransomNote.charAt(i),occ+1);
    //        }else{
    //           list1.put(ransomNote.charAt(i),1);
    //        }
    //     }

    //     for(int i=0;i<magazine.length();i++){
    //        if(list2.containsKey(magazine.charAt(i))){
    //           int occ=list2.get(magazine.charAt(i));
    //           list2.put(magazine.charAt(i),occ+1);
    //        }else{
    //           list2.put(magazine.charAt(i),1);
    //        }
    //     }

         

    //      if(list1.size()<list2.size() && magazine.contains(ransomNote)){
    //         return true;
    //      }

    //     for(char c:list1.keySet()){
    //        if(!list2.containsKey(c) || list2.size()<list1.size() || list1.get(c)>list2.get(c)){
    //         return false;
    //        }
    //     }

    //     return true;

    // }

    public static boolean canConstruct(String ransomNote, String magazine) {
        char [] one=ransomNote.toCharArray();
        char [] two=magazine.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        int match=0;
        int nm=0;

        while(match<one.length && nm<two.length){
           if(one[match]==two[nm]){
             match++;
             nm++;
           }else{
            nm++;
           }
        }

        if(match<one.length){
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        String s1="bg";

        String s2="efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";

        System.out.println(canConstruct(s1, s2));
    }
}
