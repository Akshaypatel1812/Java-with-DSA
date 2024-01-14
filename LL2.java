import java.util.*;

public class LL2 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();

        System.out.println(list.size());

        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        System.out.println(list);

        list.addLast(5);

        System.out.println(list);

        //another way to print this linked list

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");

        list.removeFirst();   //you can also remove here with index

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");

        
    }
}
