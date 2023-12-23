import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
        int a=1;
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=5;j>=i;j--)
            {
               System.out.print(" ");
                a++;
            }
             System.out.println();
            
        }
       
    }

}
