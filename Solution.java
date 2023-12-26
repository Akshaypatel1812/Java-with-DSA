
    class Solution {
        public static char nextGreatestLetter(char[] letters, char target) {
            int start = 0;
            int end = letters.length - 1;
    
            // what happen if someone gives target element which is already greater than the
            // last element
            // here in this particular problem we wrap around the lettersay it means if you
            // give 'z' then it will give you a 'c'
            if (target >=letters[letters.length - 1]) {
                return letters[0];
            }
           
    
            while (start <= end) {
                int mid = start + (end - start) / 2; // good practive to write this type of mid index
                if (target < letters[mid]) {
                    end = mid - 1;
    
                } else if (target > letters[mid]) {
                    start = mid + 1;
                } else {
                    return letters[end];
                }
            }
            return letters[start];
    
        }
    
        public static void main(String[] args) {
            char[] a = { 'c', 'f', 'j' };
    
            char target = 'c';
            System.out.println("Your smallest character in lettersay which is larger than the target is:"
                    + nextGreatestLetter(a, target)); 
        }
    }

