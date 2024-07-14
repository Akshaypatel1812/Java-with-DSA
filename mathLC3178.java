public class mathLC3178 {

    public static int numberOfChild(int n, int k) {
        if(n==2 && k%n==0){
            return 0;
        }
        if(k<n){
            return k;
        }
        int c=0;
        c=n;
        while(c<k+1){
            c=c+n-1;
        }
        
        return c-k-1;
    }
    public static void main(String[] args) {
        int n=3;
        int k=4;

        System.out.println(numberOfChild(n, k));
    }
}
