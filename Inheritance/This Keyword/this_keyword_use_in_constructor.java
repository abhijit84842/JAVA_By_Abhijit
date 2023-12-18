class A1{
    A1(){
        // constructor call must be first statement in constructor..
        this(15);       // call the parameterized constructor..

        System.out.println("Default constructor");
       
    }

    A1(int a){      // parameterized constructor...
        System.out.println("parameterized " + a);
    }
}
class this_keyword_use_in_constructor{
    public static void main(String[] args) {
        A1 obj = new A1();
        //A1 obj1= new A1(20);

    }
}