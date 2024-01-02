import java.util.Arrays;

public class bubblesortRecursion {

    static void BSR(int[] a, int i, int j) {
        if (i==a.length-1) {
            return;
        }

        if (j < a.length-1) {
            if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
             
            BSR(a,i,j+1);
        }
        else{  
            
            BSR(a,i+1,0);
        }
        
       
    }

    public static void main(String[] args) {
        int[] arr = { 10, 4, 12, 45, 2, 6, 18 };
        BSR(arr, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
}
