import java.util.*;

public class StringLC2053 {

    public static String kthDistinct(String[] arr, int k) {
       Map<String,Integer>list=new LinkedHashMap<>();
       for(int i=0;i<arr.length;i++){
        if(list.containsKey(arr[i])){
            int val=list.get(arr[i]);
            list.put(arr[i], val+1);
        }else{
            list.put(arr[i], 1);
        }
       }

       System.out.println(list);

       List<String>ans=new ArrayList<>();

       for(Map.Entry<String, Integer> entry : list.entrySet()) {
         if(entry.getValue().equals(1)){
            ans.add(entry.getKey());
         }
       }

       if(ans.size()==0 || k>ans.size()){
        return "";
       }

       return ans.get(k-1);
    }
    public static void main(String[] args) {
        String [] a={"aaa","aa","a"};

        System.out.println(kthDistinct(a,4));
    }
}
