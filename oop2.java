//Constructors:- there are three types of constructors

public class oop2 {

    oop2(){
        System.out.println("This is non-parameterized user defined constructor");
    }

    oop2(String greed){
        System.out.println("this is parameterized user defined constructor:"+greed);
    }

    public static void main(String[] args) {
        oop2 obj1=new oop2();               // here when i intitialize an object then dafault constructor 
        oop2 obj2=new oop2("hello Java");
    }
}
