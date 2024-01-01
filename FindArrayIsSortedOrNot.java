public class FindArrayIsSortedOrNot {

    // static boolean check(int[] arr) {
    //     for (int i = 0; i <= arr.length - 1; i++) {
    //         int j = i + 1;
    //         if (arr[j] < arr[i]) {
    //             return false;
    //         }

    //     }
    //     return true;
    // }

    static boolean checkRecursively(int[] arr, int i) {
        int j = i + 1;
        if(i==arr.length-1){
            return true;
        }

        if (arr[j] < arr[i]) {
            return false;
        }
        i++;
        return checkRecursively(arr, i);
    }

    public static void main(String[] args) {
        int[] a = { 3, 6, 8, 10, 78, 34, 45 };

        // System.out.println(check(a));

        System.out.println(checkRecursively(a, 0));
    }
}
