public class ArrayLC4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] ans=new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                ans[k]=nums1[i];
                i++;
            }else{
                ans[k]=nums2[j];
                j++;
            }
            k++;
        }

        while(i<nums1.length){
            ans[k]=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            ans[k]=nums2[j];
            j++;
            k++;
        }

        if(ans.length%2==1){
          return ans[ans.length/2];
        }else{
            return (double)(ans[ans.length/2] + ans[ans.length/2-1])/2;
        }
    }
    public static void main(String[] args) {
        int [] a={1,2};
        int [] b={3,4};

        System.out.println(findMedianSortedArrays(a, b));
    }
}
