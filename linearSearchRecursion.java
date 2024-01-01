import java.util.*;

public class linearSearchRecursion {

    static int lsr(int [] arr,int i,int target){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        i++;
        return lsr(arr,i,target);
    }
   
    static ArrayList<Integer> list=new ArrayList<>();
    static void lsrArraylist(int [] arr,int i,int target){
        if(i==arr.length){
            return ;
        }
        if(arr[i]==target){
            list.add(i);
        }
        i++;
        lsrArraylist(arr,i,target);
    }
    public static void main(String[] args) {
        int [] a={83,12,35,99,78,35,43};
        int target=35;
        System.out.println(lsr(a,0,target));

        lsrArraylist(a,0,target);
        System.out.println(list);

    }
}
