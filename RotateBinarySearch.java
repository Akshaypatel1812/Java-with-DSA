public class RotateBinarySearch {

    static int RBS(int [] arr,int target,int start,int end){
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }

        if(arr[start]<arr[mid]){            //ascending till mid
            if(target<arr[mid] && target>=arr[start]){
                return RBS(arr,target,start,mid-1);
            }
            else{
                return RBS(arr,target,mid+1,end);
            }
        }

        if(arr[start]>arr[mid]){           //
            if(target>arr[mid] && target<=arr[end]){
                 return RBS(arr,target,mid+1,end);
            }
            else{
                 return RBS(arr,target,start,mid-1);
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int [] a={6,7,8,9,1,2,3,5};
        System.out.println(RBS(a,2,0,a.length-1));
    }
}
