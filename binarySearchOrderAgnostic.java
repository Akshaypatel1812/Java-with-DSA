public class binarySearchOrderAgnostic {

   

    static int binarysearchorderAgnostic(int [] arr,int target){

        int start=0;
        int end=arr.length-1;
       

        boolean isACS=arr[start] < arr[end];

        while(start<=end){
             int mid=start+(end-start)/2;
            if(isACS){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    return mid;
                }
            }

            else{
                 if(target<arr[mid]){
                    start=mid+1;
                }
                else if(target>arr[mid]){
                     end=mid-1;
                }
                else{
                    return mid;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] a={2,3,5,7,9,10,18,22,24,67,75};

        int target=10;

        int [] b={75,67,24,22,18,10,9,7,5,3,2,2};
        
        System.out.println(binarysearchorderAgnostic(a,target));
        //searching in reverse order(decsending order array
         System.out.println(binarysearchorderAgnostic(b,target));
    }
}
