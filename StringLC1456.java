import java.util.*;

public class StringLC1456 {
    static List<String>ans=new ArrayList<>();
    public static int maxVowels(String s, int k) {
        int count=0;
        int max=0;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length()-(k-1);i++){
           str=new StringBuilder();
           count=0;
           for(int j=i;j<i+k;j++){
              if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u'){
                count++;
              }
              str.append(s.charAt(j));
              if(str.length()==k  && count>max){
                 max=count;
                 break;
              }
           }

        }

        return max;
    }
    public static void main(String[] args) {
        String s="leetcode";

        System.out.println(maxVowels(s, 3));
    }
}
