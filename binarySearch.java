public class binarySearch {

    static int binarysearch(int []arr,int target){
         int low=0;
        int high=arr.length-1;
        
        
        while(low<=high){
            int mid=low+(high-low)/2;   // good practive to write this type of mid index
            if(target<arr[mid]){
                high=mid-1;
               
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int []a={-11,-7,-4,2,12,45,66,77,98,101,134,245};
       
        int target=12;
        System.out.println("your targeted element is:"+binarysearch(a,target)); //return you a mid index
    }
}
