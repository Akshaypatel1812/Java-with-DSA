import java.util.*;

public class ArrayLC392 {
    static ArrayList<Integer>list=new ArrayList<>();
    // public static boolean isSubsequence(String s, String t) {
    //     if(s.length()==0 && t.length()==0){
    //         return true;
    //     }

    //     if(t.length()==0){
    //         return false;
    //     }

    //     if((s.length()==1 && t.length()==1) && (s.charAt(0)!=t.charAt(0))){
    //         return false;
    //     }
    //     helper(t,"");
    //     if(list.contains(s)){
    //         return true;
    //     }

    //     return false;
    // }

    // public static void helper(String s,String n){
    //     if(s==""){
    //         list.add(n);
    //         return;
    //     }

    //     helper(s.substring(1),n);
    //     helper(s.substring(1),n+s.charAt(0));
    // }

    // static ArrayList<String>list=new ArrayList<>();
    // public static boolean isSubsequence(String s, String t) {
    //     list=new ArrayList<>();
    //     if(s.length()==0 && t.length()==0){
    //         return true;
    //     }
    //     helper(t,"");
    //     return list.contains(s);
    // }

    // public static void helper(String s,String n){
        
    //     if(s.equals("")){
    //         list.add(n);
    //         return;
    //     }

    //     helper(s.substring(1),n);
    //     helper(s.substring(1),n+s.charAt(0));
    // }

    public static boolean isSubsequence(String s, String t) {
        for(int i=0;i<s.length();i++){
            list.add(t.indexOf(s.charAt(i)));
        }

        for(int j=0;j<list.size()-1;j++){
            if(list.get(j)>list.get(j+1)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1="twn";
        String s2="xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxtxxxxxxxxxxxxxxxxxxxxwxxxxxxxxxxxxxxxxxxxxxxxxxn";

        System.out.println( isSubsequence(s1,s2));

       System.out.println(list);

        
    }
}
