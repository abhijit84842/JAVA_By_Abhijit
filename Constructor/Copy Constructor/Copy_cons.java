class A2{
    int a ; 
    String b;
    A2(){
        a=25;
        b="Coder World";
        System.out.println("First constructor : "+ a +" and " + b);
    }

    /*Copy the all content of A2 */
    A2(A2 ref){     // class name and reference as parameter..
        a=ref.a;
        b=ref.b;
        System.out.println("Second constructor after copy : "+ a +" and " + b);
    }
}

class Copy_cons{
    public static void main(String[] args) {
        A2 obj1 = new A2();
        A2 obj2 = new A2(obj1);
        
    }
}