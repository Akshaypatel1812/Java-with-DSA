
/*here we code the method overriding in Dynamic polymorphism
 * method overriding requires 4 things 
 * 1.same mathod name
 * 2.different class
 * 3.same argument
 * 4.inheritance or IS-A relationship
 */
class test {  //here after version 1.4 of java return type not required to same but in overriding child class return type should be a sub type of parents return type
    void show() {
        System.out.println("test class method");
        
    }
}

public class oop42 extends test {

    void show() {
        System.out.println("oop4 class method");
    }

    public static void main(String[] args) {
        test t1 = new test();
        t1.show();

        oop42 obj = new oop42();
        obj.show(); // here objects calls the methods according to their classes
    }
}
