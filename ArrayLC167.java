public class ArrayLC167 {
    public static int[] twoSum(int[] numbers, int target) {
        int []ans=new int[2];
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    ans[0]=i+1;
                    ans[1]=j+1;
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int [] a={2,3,4};
        int []ans=twoSum(a, 6);

        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
