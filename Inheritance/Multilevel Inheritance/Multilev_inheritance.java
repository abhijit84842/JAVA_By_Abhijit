class Father{
    int a;
    int b;
    void getData(int x , int y ){
        a=x;
        b=y;
    }
}

class Son extends Father{
    int c;
    void add(){
        c= a+b;
    }
}

class Grandson extends Son{
    void display(){
        System.out.println("A is = " + a);
        System.out.println("B is = " +b);
        System.out.println("The addition is = " + c);
    }
}
class Multilev_inheritance{
    public static void main(String[] args) {
        Grandson obj = new Grandson();
        obj.getData(20,30);
        obj.add();
        obj.display();
    }
}