import java.util.Arrays;

public class LC274 {
    public static int hIndex(int[] citations) {
        if(citations.length==1){
            if(citations[0]>0){
                return 1;
            }
            return 0;
        }
        Arrays.sort(citations);
        int start=0;
        int end=citations.length-1;

        while(start<end){
            int temp=citations[start];
            citations[start]=citations[end];
            citations[end]=temp;

            start++;
            end--;
        }

        for(int k=0;k<citations.length;k++){
            if(citations[k]<=k){
                return k;
            }
        }

        return citations.length;
    }
    public static void main(String[] args) {
        int [] arr={1,3,1};

       System.out.println( hIndex(arr));

    }

}
