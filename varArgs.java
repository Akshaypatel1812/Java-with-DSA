//varArgs simply allow you to pass hole array in argument

import java.util.Arrays;

public class varArgs {
    static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }
    //Method overloading concept
    static void demo(int a,int b,String...v){
        System.out.println(a + " String"+Arrays.toString(v));
    }

    public static void main(String[] args) {
        demo("Akshay", "Deepak", "Kiran");
        demo(1,2,"Akshay","Kiran");
    }
}
