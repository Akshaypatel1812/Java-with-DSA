//public class BinarySearchLC3 {
//    static int[] binarysearch(int []arr,int target){
//         int start=0;
//        int end=arr.length-1;
//
//
//        while(start<=end){
//
//            int mid=start+(end-start)/2;   // good practive to write this type of mid index
//            if(target<arr[mid]){
//                end=mid-1;
//
//            }
//            else if(target>arr[mid]){
//                start=mid+1;
//            }
//            else{
//                return new int[]{si,ei};
//            }
//        }
//        return new int[]{-1,-1};
//
//    }
//    public static void main(String[] args) {
//        int []a={-11,-7,-4,2,12,45,66,77,98,101,134,245};
//
//        int target=12;
//        System.out.println("your targeted element is:"+binarysearch(a,target)); //return you a mid index
//    }
//}
