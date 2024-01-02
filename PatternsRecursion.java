public class PatternsRecursion {

    static void pattern1(int n) {
        int j = 0;
        if (n == 0) {
            return;
        }
        while (j < n) {
            System.out.print("*");
            j++;
        }
        System.out.println();
        n--;
        pattern1(n);
    }

    static void pattern2(int n,int j) {
       if(n==j){
        return;
       }
       if(j<n){
        pattern2(n, j+1);
        System.out.print("*");
       }
       else{
        pattern2(n-1,0);
        System.out.println();
       }
    }

    public static void main(String[] args) {
        pattern1(4);
        pattern2(4,0);
    }
}
