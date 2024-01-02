import java.util.Arrays;

public class bubblesortRecursion {

    static void BSR(int[] a, int i, int j) {
        if (i == a.length - 1) {
            return;
        }

        if (j < a.length - i) {
            if(a[j-1]>a[j]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
             
            BSR(a,i,j++);
        }
        else{  

            BSR(a,i++,j);
        }
        
       
    }

    public static void main(String[] args) {
        int[] arr = { 10, 4, 12, 45, 2, 6, 18 };
        BSR(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
}
