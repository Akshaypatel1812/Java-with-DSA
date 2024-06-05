public class ArrayLC1524 {
    public static int numOfSubarrays(int[] arr) {
        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=arr[i];
            if(sum%2==1){
                count++;
            }
            for(int j=i+1;j<arr.length;j++){
               sum=sum+arr[j];
               if(sum%2==1){
                count++;
               }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int [] a={2,4,6};
        System.out.println(numOfSubarrays(a));
    }
}
