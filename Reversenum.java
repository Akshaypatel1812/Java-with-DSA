import java.util.Scanner;

public class Reversenum {
    public static void main(String[] args) {
        int ans=0;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num>0){
           int rem=num%10;
           num=num/10;
           ans=ans*10+rem;
        }
       System.out.println(ans);
    }
}
