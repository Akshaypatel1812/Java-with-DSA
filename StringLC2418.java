import java.util.*;

public class StringLC2418 {
    // public static String[] sortPeople(String[] names, int[] heights) {
    // int [] arr=heights;
    // Arrays.sort(heights);
    // int j=0;

    // for(int i=heights.length-1;i>=0;i--){
    // int index=indexOf(arr, heights[i]);

    // //System.out.println(index);
    // names[j]=names[index];
    // j++;
    // }

    // return names;
    // }

    // public static int indexOf(int [] h,int ele){
    // for(int i=0;i<h.length;i++){

    // if(h[i]==ele){

    // return i;
    // }
    // }

    // return 0;
    // }

    public static String[] sortPeople(String[] names, int[] heights) {
        int j=names.length-1;
        TreeMap<Integer,String>list=new TreeMap<>();

        for(int i=0;i<names.length;i++){
            list.put(heights[i], names[i]);
        }

       
        for (Map.Entry<Integer, String> entry : list.entrySet()) {
            names[j] = entry.getValue();
            j--;
        }

        return names;
    }

    public static void main(String[] args) {
        String[] str = { "Alice", "Bob", "Bob" };

        int[] heights = { 155, 185, 150 };

        String[] ans = sortPeople(str, heights);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
