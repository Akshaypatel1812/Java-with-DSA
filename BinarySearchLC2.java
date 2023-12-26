// it will give you a index num which is >= to your target element

public class BinarySearchLC2 {
    static char binarysearch(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        // what happen if someone gives target element which is already greater than the last element
        // here in this particular problem we wrap around the lettersay it means if you give 'z' then it will give you a 'c'
        if (target >= letters[letters.length - 1]) {
            return letters[0];
        }
        

        while (start <= end) {
            int mid = start + (end - start) / 2; // good practive to write this type of mid index
            if (target < letters[mid]) {
                end = mid - 1;
            }
             else {
                start = mid + 1;
            } 
        }
        return letters[start];

    }

    public static void main(String[] args) {
        char[] a = { 'c', 'f', 'j'};

        char target = 'j';
        System.out.println("Your smallest character in lettersay which is larger than the target is:" + binarysearch(a, target)); // return you a mid index
    }
}
