class Father1{
    int a ;
    int b;
    void getData(int x , int y){
        a=x;
        b=y;
    }
}
class Son1 extends Father1{
    int add(){
        int sum = a+b;
        return sum;
    }
    void show(){
        System.out.println("The sum of A and B is = "+ add());
    }
}

class Son2 extends Father1{
    int multiply(){
        int multi=(a*b);
        return multi;
        
    }

    void display(){
        System.out.println("The multiply of A and B is : = "+ multiply());
    }
}


class Hirchical_iht{
    public static void main(String[] args) {
       Son1 obj1 = new Son1();
       Son2 obj2 = new Son2();

       obj1.getData(2, 3);      // for Son1 
       obj2.getData(5, 5);

       obj1.show();         // Call Son1 method

       obj2.display();      // Call Son2 method
        

    }

}



