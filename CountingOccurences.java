import java.util.Scanner;
public class CountingOccurences{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=sc.nextInt();
        int count=0;
        while(num>0){
           int rem=num%10;
           if(rem==n)
           {
              count++;
             
           }

            num=num/10;
        }
        System.out.println("n is Occurences in num:"+count );
    }
}