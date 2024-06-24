public class ArrayLC1248 {

    public static int numberOfSubarrays(int[] nums, int k) {
        int total=0;
        int oddcount=0;
        for(int i=0;i<nums.length;i++){
        oddcount=0;
        if(nums[i]%2==1){
        oddcount++;
        }
        if(oddcount==k){
        total++;
        }
        for(int j=i+1;j<nums.length;j++){
        if(nums[j]%2==1){
        oddcount++;
        }
        if(oddcount==k){
        total++;
        }
        }
        }

        return total;
    }

    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 1, 1 };
        System.out.println(numberOfSubarrays(a, 3));
    }
}
