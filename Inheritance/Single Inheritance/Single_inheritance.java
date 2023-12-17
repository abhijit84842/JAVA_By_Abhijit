class Father{
    int a ;
    int b;
    void getData(int x , int y){
        a=x;
        b=y;
    }
}
class Son extends Father{
    int c;
    void add(){
        c=a+b;
        System.out.println(c);
    }

    void display(){
        System.out.println("A is = " + a);
        System.out.println("B is = " + b);
    }

}
class Single_inheritance{
    public static void main(String[] args) {
        Son obj = new Son();
        obj.getData(20,30 );
        obj.display();
        obj.add();
    }
}