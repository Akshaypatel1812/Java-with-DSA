import java.util.Arrays;

public class GreedyMADP {
    
    public static int minimumAbsoluteDifferencePairs(int a[] ,int b[]){
        int count=0;
        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0;i<a.length;i++){
            count+=Math.abs(a[i]-b[i]);
        }

        return count;
    }

    public static void main(String[] args) {
        int [] a={2,1,5,9};
        int []b={7,2,3,1};

        System.out.println(minimumAbsoluteDifferencePairs(a, b));
    }
}
