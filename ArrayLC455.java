import java.util.*;

public class ArrayLC455 {

    // public static int findContentChildren(int[] g, int[] s) {
    //     Arrays.sort(g);
    //     Arrays.sort(s);

        
    //     int count=0;

    //     for(int i=0;i<g.length;i++){
    //        if(isContains(s, count, i)>=0){
    //         count++;
    //        }
    //     }

    //     return count;
    // }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int start=0;
        int end=0;
        int count=0;

        while(start<=g.length-1 && end<=s.length-1 ){
             if(g[start]<=s[end]){
                count++;
                
             }else{
                end++;
             }
             start++;
             end++;
        }

        return count;
    }

    public static int isContains(int [] s,int x,int ele){
         for(int i=x;i<s.length;i++){
            if(ele==s[i]){
                return i;
            }
         }

         return -1;
    }
    public static void main(String[] args) {
        int [] a={1,2};
        int [] b={1,2,3};

        System.out.println(findContentChildren(a, b));
    }
}
