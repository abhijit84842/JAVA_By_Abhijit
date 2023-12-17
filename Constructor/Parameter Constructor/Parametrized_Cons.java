class A1{
    int a;
    int b ;
    A1(int x , int y){
        a= x + y ;
        b =x - y;
    }
    void show(){
        System.out.println(a + " " + b);
    }
}
class Parametrized_Cons{
    public static void main(String[] args) {
        A1 obj = new  A1(8,2);
        obj.show();
    }
}