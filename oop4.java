// here for method overloading class must be same and no of arguments,sequence of arguments,type of argument must be different

// for more theory refer notes->oop4

class methods{
    void show(){
        System.out.println("show method with out parameter");
    }

    void show(String para){
        System.out.println("show method with parameter "+para);
    }
    

    void show(int a){
        System.out.println("show method with out parameter "+a);
    }

}

class oop4{
    public static void main(String[] args) {
        methods m1=new methods();
        m1.show("akshay");

        m1.show(3);


    }
}