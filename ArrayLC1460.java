import java.util.Arrays;

public class ArrayLC1460 {
    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);


        if(arr.equals(target)){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int [] target={1,2,3,4};
        int [] arr={2,4,1,3};

        System.out.println(canBeEqual(target, arr));

    }
}
