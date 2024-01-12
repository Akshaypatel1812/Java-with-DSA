//here if we have abstract method then we have to make class abstract

abstract class car{
   abstract void start();
}

class porsche extends car{
    void start(){
        System.out.println("push start");
    }
}

class wagonR extends car{
    void start(){
        System.out.println("key start");
    }
}

public class oop5 {
    public static void main(String[] args) {
        //here we can not create a object of car class bacause it is abstact class

        porsche cayman=new porsche();
        cayman.start();
 
        wagonR w1=new wagonR();
        w1.start();
        
    }
}
