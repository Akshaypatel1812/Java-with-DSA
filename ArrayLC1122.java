import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.management.AttributeList;

public class ArrayLC1122 {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length];
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>remain=new ArrayList<>();

        int j = 0;
        int k = 0;
        while (k != arr1.length && j<arr2.length) {
            
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[j]) {
                    ans[k] = arr1[i];
                    list.add(i);
                    k++;
                }
            }
            j++;
        }

        
        for(int x=0;x<arr1.length;x++){
            if(list.contains(x)){

            }else{
                remain.add(arr1[x]);
            }
        }

        Collections.sort(remain);
        int index=0;
        while(k!=arr1.length && index!=remain.size()){
            ans[k]=remain.get(index);
            index++;
            k++;
        }

        for(int m=0;m<ans.length;m++){
            System.out.println(ans[m]);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 28,6,22,8,44,17 };
        int[] b = { 22,28,8,6 };
        relativeSortArray(a, b);
    }
}
