import java.util.Scanner;
public class LinearSearch {

    public static int searchinArray(int [] arr,int tar){

        for(int i=0;i<arr.length;i++){
            int element = arr[i];
            if(element==tar){
                return i;
            }
        } 

        return -1;
        
    }

    public static boolean searchinstring(String str,char target){
        if(str.length()==0){
            return false;
        }

        for(int j=0;j<str.length();j++){
            char ele=str.charAt(j);
            if(ele==target){
                return true;
            }
        }

        return false;
    }

     public static boolean searchArrayinrange(int [] arr,int target){
        if(arr.length==0){
            return false;
        }

        for(int j=2;j<=9;j++){
            int ele=arr[j];
            if(ele==target){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
         int []arr={2,3,4,5,6};
         System.out.println("enter your target element:");
         Scanner sc= new Scanner(System.in);
         int target=sc.nextInt();
         System.out.println("your target element is at index:"+searchinArray(arr,target));

         //searching for char in string

         String str="AKSHAY";
         System.out.println("your target character is:"+searchinstring(str,'K'));  //this search is case sensitive

         //search in given index

         int [] arr2=new int[10];
         System.out.println("add 10 Array elements:");
         for(int k=0;k<arr2.length;k++){
            arr2[k]=sc.nextInt();
         }
        //  System.out.println("Enter your starting range and then ending range from 0 to 9:");
        //  int Srange=sc.nextInt();
        //  int Erange=sc.nextInt();
        //  System.out.println("enter your target element:");
        //  int target2=sc.nextInt();
        //  System.out.println("here your target element from your"+Srange+"to"+Erange+":"+searchArrayinrange(arr,target2,Srange,Erange));   
        
        System.out.println("enter your target element:");
        int target2=sc.nextInt();
        System.out.println(searchArrayinrange(arr,target2));
    }
}
