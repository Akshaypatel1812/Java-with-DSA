import java.util.*;

public class ArrayLC907 {

     public static int sumSubarrayMins(int[] arr) {
       
        
        int count=0;
        for(int i=0;i<arr.length;i++){
            
            int min=Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
           
               min=Math.min(min, arr[j]);
               count=count+min;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int [] arr={3,1,2,4};

        System.out.println(sumSubarrayMins(arr));
    }
}
