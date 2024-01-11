//here we code the method overriding in Dynamic polymorphism
class test {
    void show() {
        System.out.println("test class method");
    }
}

public class oop42 extends test {

    void show() {
        System.out.println("oop4 class method");
    }

    public static void main(String[] args) {
        test t1=new test();
        t1.show();

        oop42 obj=new oop42();
        obj.show();
    }
}
