import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class ArrayLeaders{

    public static ArrayList<Integer> leaders(int n, int arr[]) {
         ArrayList<Integer>list=new ArrayList<>();
         int max=arr[arr.length-1];
         list.add(arr[arr.length-1]);
         for(int i=arr.length-1;i>0;i--){
             if(arr[i-1]>=arr[i] && arr[i-1]>=max){
                 list.add(arr[i-1]);
                 max=arr[i-1];
             }
         }
         Collections.reverse(list);
    
         return list;
    }
    public static void main(String[] args) {
        int [] a={10,4,2,4,1};

        System.out.println(leaders(6, a));

    }
}