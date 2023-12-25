// it will give you a index num which is >= to your target element

public class CeilingOfNum {
    static int binarysearch(int []arr,int target){

       //what happen if someone gives target element which is already greater than the last element in the array then we use below if condition
       if(target>arr[arr.length-1]){
         System.out.println("please enter valid target element");
         return -1;
       }
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
       return low;
       
   }
   public static void main(String[] args) {
       int []a={-11,-7,-4,2,12,45,66,77,98,101,134,245};
      
       int target=4;
       System.out.println("your Ceiling of nu is:"+binarysearch(a,target)); //return you a mid index
   }
}
