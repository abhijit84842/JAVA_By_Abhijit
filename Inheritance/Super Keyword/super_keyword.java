class A{
    int a= 20;      // super class variable..


}
class B extends A{
    int a = 50;

    void show(){
        System.out.println(a);      // print the class B variable..
        System.out.println(super.a);    // use super keyword to print the super class variable..
    

    }
}

class super_keyword{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
  
}