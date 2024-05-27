public class ArrayLC1608 {
    public static int specialArray(int[] nums) {
        int count = 0;
        int check = 1;
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > max) {
                max = nums[j];
            }
        }
        while (check <=max) {
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]>=check){
                    count++;
                }
                

            }
            if(count==check){
                return count;
            }
            count=0;
            check++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 0,0};

        System.out.println(specialArray(nums));
    }
}
