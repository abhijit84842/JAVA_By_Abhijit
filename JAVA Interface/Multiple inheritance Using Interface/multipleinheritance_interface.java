interface A {
    public abstract void show();        //PUBLIC + Abstract
}

interface B{
    public abstract void display();
}

class D implements A, B{      //PUBLIC + Abstract
    @Override
    public void show(){
        System.out.println("This is interface A ..");
    }

    @Override
    public void display(){
        System.out.println("This is interface B..");
    }
}

class multipleinheritance_interface{
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
        obj.display();
    }
}