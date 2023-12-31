public class fibonacciRecursion {
    static void printfobinacci(int n1, int n2) {

        int n3 = n2 + n1;
        if (n3 < 100) {
            System.out.println(n3);
            printfobinacci(n2, n3);
        }
        else{
            return;
        }
    }

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        printfobinacci(n1, n2);
    }
}
