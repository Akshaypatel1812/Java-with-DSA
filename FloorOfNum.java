//it will give you a index num which is <= to your target element

public class FloorOfNum {
    static int binarysearch(int []arr,int target){
        // here if someone enter a number which is less then the forst index elemment of the array than it will automatically return you a -1 but if you want to do something than

        if(target<arr[0]){
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
       return high;
       
   }
   public static void main(String[] args) {
       int []a={-11,-7,-4,2,12,45,66,77,98,101,134,245};
      
       int target=-12;
       System.out.println("your FloorOfNum is:"+binarysearch(a,target)); //return you a mid index
   }
}
