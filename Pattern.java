
public class Pattern {

    static void pattern1(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int rows) {

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern5(int rows) {
        int c = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }

    static void pattern6(int rows) {

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);

            }
            System.out.println();

        }
    }

    static void pattern7(int rows) {
        char c = 'a';
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }

    static void pattern8(int rows) {

        for (int i = 1; i <= 2 * rows - 1; i++) {
            if (i > rows) {
                for (int j = 1; j <= (2 * rows) - i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern9(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i + j <= rows) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern10(int rows) {
        for (int i = 1; i <= 2 * rows - 1; i++) {
            if (i > rows) {
                for (int space = 1; space <= rows - (2 * rows - i); space++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * rows - i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int space = 1; space <= rows - i; space++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }

    static void pattern11(int rows) {
        for (int i = 5; i >= 1; i--) {

            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern12(int rows) {

        for (int i = 0; i < rows; i++) {
            for (int space = 1; space < rows - i; space++) {
                System.out.print(" ");
            }
            int num = 1;
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    static void pattern13(int rows) {
        for (int i = 1; i <= 2 * rows - 1; i++) {
            if (i > rows) {
                for(int space=1;space<=rows-(2*rows-i);space++){
                    System.out.print(" ");
                }
                for(int j=2*rows-i;j>=1;j--){
                    System.out.print("*");
                }
                for(int j=2;j<=2*rows-i;j++){
                    System.out.print("*");
                }
            } else {
                
                for (int space = 1; space <= rows - i; space++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        pattern1(5, 5);
        pattern2(5);
        System.out.println("pattern:3");
        pattern3(5);

        System.out.println("pattern:4");
        pattern4(5);

        System.out.println("pattern:5");
        pattern5(5);

        System.out.println("pattern:6");
        pattern6(5);

        System.out.println("pattern:7");
        pattern7(5);

        System.out.println("pattern:8");
        pattern8(5);

        System.out.println("pattern:9");
        pattern9(5);

        System.out.println("pattern:10");
        pattern10(5);

        System.out.println("pattern:11");
        pattern11(5);

        System.out.println("pattern:12");
        pattern12(5);

        System.out.println("pattern:13");
        pattern13(5);
    }
}
