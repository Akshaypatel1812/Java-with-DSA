public class ArrayLC1752 {

    public static boolean check(int[] nums) {
        int min=Integer.MAX_VALUE;
        int minIndex=0;
        int [] Sarr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                minIndex=i;
            }
        }
        int k=nums.length-minIndex;
        for(int j=0;j<nums.length;j++){
            Sarr[(j+k)%Sarr.length]=nums[j];
        }

        return isSort(Sarr);
        
    }

    public static boolean isSort(int [] Sarr){
        for(int i=0;i<Sarr.length-1;i++){
            if(Sarr[i]>Sarr[i+1]){
               return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int [] a={3,4,5,1,2};

        System.out.println(check(a));
    }
}
