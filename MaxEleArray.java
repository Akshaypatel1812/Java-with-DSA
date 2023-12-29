import java.lang.reflect.Array;

public class MaxEleArray {

    public static int MaxElement(int [] arr){
        int max=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int [] arr={45,67,23,12,57,30};

        System.out.println(MaxElement(arr));
    }
}
