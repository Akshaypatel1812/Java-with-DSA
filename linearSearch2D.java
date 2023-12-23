import java.util.Arrays;
import java.util.Scanner;

public class linearSearch2D {
    static int[] linearsearch(int [][]arr,int target){
        
         for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
               if(arr[row][col]==target){
                 return new int[]{row,col};
               }
            }
         }

         return new int[]{-1,-1};
         
    }

    public static void main(String[] args) {
        int [][]arr={
            {2,3,4},
            {5,6,7,18,12},
            {8,9,1,23}
        };

        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int []ans= linearsearch(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}
