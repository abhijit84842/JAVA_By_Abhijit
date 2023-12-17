class A5{
    int a ; int b;
    A5(){       // default constructor...
        a=20;
        b=50;
    }
    A5(int x,int y){
        
        int sum = x+y;
        int multiply= x*y;
         System.out.println(sum + " "+ multiply);
    }
    void show(){
        System.out.println(a + " " + b );
    }
}

class Cons_Overloading{
    public static void main(String[] args) {
        A5 obj1 = new A5();
        A5 obj2 = new A5(2,4);

        obj1.show();
        
        
        
    }
}