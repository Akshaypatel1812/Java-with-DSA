import java.util.Arrays;
import java.util.Scanner;

public class Array1d {
    public static void main(String [] args){
        int []arr=new int[5];
        arr[0]=2;
        arr[1]=3;
        arr[2]=4;
        arr[3]=5;
        arr[4]=6;

        //method 1 to print an array but this is quite long
        System.out.println(arr[1]);
        System.out.println(arr[3]);

        //method 2 using for loop
        System.out.println("using for loop:");
        for(int i=0;i<5;i++){
            
            System.out.println(arr[i]);
        }
       
        System.out.println("using for each loop:");
        for(int num:arr){
            System.out.println(num);
        }
        
        //to covert array into string 
        System.out.println("converted array into string: ");
        System.out.println(Arrays.toString(arr));

        // here we see how to take array input from the user 
        int [] arr2=new int[10];
        Scanner input=new Scanner(System.in);
        System.out.println("Add " + arr2.length + " Array elements:");
        for(int i=0;i<=arr2.length;i++){
            arr2[i]=input.nextInt();
        }

        for(int i=0;i<=arr2.length;i++){
            System.out.println(arr2[i]);
        }



    }
}


