import java.util.Scanner;

public class Araay2d {
    public static void main(String[] args) {
        // int [][] arr={

        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}

        // };

        // System.out.println(arr[1][1]);

        int [][] arr2=new int[3][4];
        Scanner sc=new Scanner(System.in);

        for(int rows=0;rows<3;rows++){
            for(int cols=0;cols<=arr2[rows].length;cols++){
                 arr2[rows][cols]=sc.nextInt();
            }
        }

        for(int rows=0;rows<4;rows++){
            for(int cols=0;cols<=arr2[rows].length;cols++){
                 System.out.println(arr2[rows][cols] + " ");
            }
            System.out.println();
        }

    }
}
