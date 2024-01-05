
class birds{
    void fly(){
        System.out.println("Birds are flying");
    }
}
public class oop1 {

    public void eat(){                   //here if i want to call this methid with out static then i will have to create object for this
        System.out.println("animal is eating");
    }

    void run(){
        System.out.println("animal is running");
    }
    public static void main(String[] args) {
        oop1 obj=new oop1();
        obj.eat();
        obj.run();

        birds b1=new birds();
        b1.fly();

    }
}
