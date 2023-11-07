import java.util.Scanner;
public class basics {
    public static void main(String[] args) {
        System.out.println("hello world");
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Hello "+sc.nextLine());   //nextline is for hole string 
        
        /*here nextInt/Flot/char etccc use foe difference purposes*/ 

        // Type casting 

        int num=(int)(67.56f);  //converting float into integer
        System.out.println(num);

        //Auto matic Type conversion

        int a=450;
        byte b=(byte)(a);
        System.out.println(b);   //it will give near num like 256*2=512 than it will give -12 if a=450 than it will give -62 but if i have 270 than b=14

        
    }
}
