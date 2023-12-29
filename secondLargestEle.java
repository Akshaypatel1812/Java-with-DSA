import java.util.Arrays;

public class secondLargestEle {
    public static void main(String[] args) {
        int[] array = {10, 5, 7, 2, 8, 15, 3};

        // Sort the array in descending order
        Arrays.sort(array);

        for(int i=0;i<=array.length-1;i++){
            System.out.println(array[i]);
        }

        // Check if there is a second largest element
        if (array.length < 2) {
            System.out.println("There is no second largest element.");
        } else {
            // The second largest element is the one at index array.length - 2
            int secondLargest = array[array.length - 2];
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
