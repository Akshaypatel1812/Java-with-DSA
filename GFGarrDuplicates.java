import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class GFGarrDuplicates {
     public static ArrayList<Integer> duplicates(int arr[], int n) {
        HashSet<Integer>list=new HashSet<>();
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                list.add(arr[i]);
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }

        ArrayList<Integer>ans=new ArrayList<>(list);
        return ans;
    }
    public static void main(String[] args) {
        int [] arr={3,4,12,3,12,3,4,4,12,7,11,6,5};
        int n=arr.length;
        
        System.out.println(duplicates(arr, n));
    }
    
}
