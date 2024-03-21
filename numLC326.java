public class numLC326 {

    public static boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
    
    
    public static void main(String[] args) {
        int n=9;
        System.out.println(isPowerOfThree(n));
    }
}
