public class BinarySearchRecursion {
   public static int binarysearch(int [] arr,int start,int end,int target){
        int mid=start+(end-start)/2;
        if(start>end){
            return -1;
        }
        if(target==arr[mid]){
            return mid;
        }
        else if(target<arr[mid]){
            return binarysearch(arr, start, mid-1, target);
        }
        else{
            return binarysearch(arr, mid+1, end, target);
        }
        
   }
    public static void main(String[] args) {
        int []a={2,5,7,8,23,445,555};
        int start=0;
        int end=a.length-1;
        int target=3;
        System.out.println(binarysearch(a,start,end,target));
    }
}
