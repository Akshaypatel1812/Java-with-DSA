public class reversenumRecursion {
    static int sum=0;
    static void reverse(int num){
        if(num==0){
            return ;
        }
        int rem=num%10;
        sum=sum*10 + rem;
        reverse(num/10);
    }
    public static void main(String[] args) {
        int num=35645;
        reverse(num);
        System.out.println(sum);
        if(sum==num){
            System.out.println("num is palindrom:");
        }
        else{
            System.out.println("not palindrom");
        }
    }
}
