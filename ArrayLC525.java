public class ArrayLC525 {

    public static int findMaxLength(int[] nums) {
        int cz=0;
        int co=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                co++;
            }else{
                cz++;
            }
        }

        return 2*(Math.min(cz, co));
    }
    public static void main(String[] args) {
        int [] num={1,1,1,0,0,1,1};
        System.out.println(findMaxLength(num));
    }
}
