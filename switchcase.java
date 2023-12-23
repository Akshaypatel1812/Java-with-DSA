import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        // System.out.println("Enter any fruit from orange,watermalon,apple&banana:");
        Scanner sc=new Scanner(System.in);
        // String Fruit=sc.nextLine();
        
        // switch(Fruit){
        //    case "orange":
        //    System.out.println("A fruit with full of vitamin C");
        //    break;

        //    case "watermalon":
        //    System.out.println("A fruit with full of water");
        //    break;

        //    case "apple":
        //    System.out.println("A sweet red fruit");
        //    break;

        //    case "banana":
        //    System.out.println("A fruit for muscle building");
        //    break;

        //    default:
        //    System.out.println("A enter valid fruit");
        //    break;
           
        // }
 
        //Nested switch statements
        System.out.println("enter your empId:");
        int empId=sc.nextInt();
        String field="BackEnd developer";
        //  System.out.print("enter your field:");
        //           String field=sc.nextLine();  
         
        switch(empId){
            case 1:
            System.out.println("Mechnical person with empId:"+empId);
            break;

            case 2:
            System.out.println("Ec person with empId:"+empId);
            break;

            case 3:
                  switch(field){
                    case "FrontEnd developer"->System.out.println(field+empId);
                    case "BackEnd developer"->System.out.println(field+empId);
                    default->System.out.println("Please enter a valid field");

                  }
            break;
            default:
            System.out.println("please enter a valid empId:");     
        }

        
    }
}
