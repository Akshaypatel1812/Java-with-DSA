//here we see Inheritance in java -> types of inheritance and some important questions 

//here class b extends only a is single constructor
//     class c extends b and class b extends a is multilevel constructor
//here if class b & c both extends a then it is multiple constructor 
//here hierarchical & hybrid constructor is not support by java -> why? ->refer oop3 notes

public class OOP3 {

    static class a {
        void showA() {
            System.out.println("this is class a");
        }
    }

    static class b extends a{
        void showB(){
            System.out.println("this is class b");
        }
    }

    static class c extends a{
        void showC(){
            System.out.println("this is class c");
        }
    }

    public static void main(String[] args) {
        a obj1 = new a();
        obj1.showA();
        // obj3.showB();
        // obj3.showC();

        b obj2=new b();
        obj2.showA();
        obj2.showB();
        // obj3.showC();

        c obj3=new c();
        obj3.showA();
        // obj3.showB();
        obj3.showC();
    }
}
