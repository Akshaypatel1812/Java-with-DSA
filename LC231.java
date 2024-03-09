public class LC231 {
    public static boolean isPowerOfTwo(int n) {
        while(n!=1 && n%2==0){
            n=n/2;
        }
         
        if(n==1){
           return true;
        }
        else{
            return false;
        }
        
       
    }
    public static void main(String[] args) {    
        int num=1;
       
        System.out.println(isPowerOfTwo(num));
    }
}
