import java.util.HashSet;

public class ArrayLC2149 {

    public static int[] rearrangeArray(int[] nums) {
        int[] cont = new int[nums.length];
        int pindex = 0;
        int nindex = nums.length/2;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                cont[pindex] = nums[i];
                pindex++;
            } else {
                cont[nindex] = nums[i];
                nindex++;
            }
        }
        pindex=0;
        nindex=cont.length/2;
        for (int j = 0; j < nums.length; j++) {
            if (j % 2 == 0) {
                nums[j] = cont[pindex++];
            } else {
                nums[j] = cont[nindex++];
            }
        }

        for(int k=0;k<nums.length;k++){
            // System.out.print(cont[k]+" ");
            System.out.println(nums[k]);
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {5,-4,-1,7};

        rearrangeArray(arr);

    }
}
