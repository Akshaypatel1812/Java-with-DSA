public class practice {
        public static void main(String[] args) {
            int rows = 5; // You can change the value to adjust the number of rows
    
            for (int i = 0; i < rows; i++) {
                // Print spaces before the numbers
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
    
                int number = 1;
                for (int k = 0; k <= i; k++) {
                    System.out.print(number + " ");
                    number = number * (i - k) / (k + 1);
                }
    
                // Move to the next line after each row
                System.out.println();
            }
        }
    }
