public class LC189 {

    public static void rotate(int[] nums, int k){
        
        for(int i=0;i<k;i++){
            int temp=nums[nums.length-1];       // take last element in temp
            for(int j=nums.length-1;j>0;j--){
                nums[j]=nums[j-1];              //j++ of all element
            }
            nums[0]=temp;
        }

        for(int p=0;p<nums.length-1;p++){
            System.out.print(nums[p]+",");
        }
    }
    public static void main(String[] args) {

        int [] a={1,2,3,4,5,6,7};

        rotate(a,3);

    }
}
