import java.util.Arrays;

public class reverseArray {

    static void printarray(int [] arr){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i] + ",");
        }
    }

    static void reverse(int []arr){
         int start=0;
         int end=arr.length-1;

         while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            
            start++;
            end--;
         }

         
    }
    public static void main(String[] args) {
        int []a={2,6,9,1,56,23,45};
        reverse(a);

        printarray(a);
    }
}
