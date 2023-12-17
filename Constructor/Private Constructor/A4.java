class A4{
    int a ;
    double b;
    String s;
   private A4(){
    a=20;
    b=35.6;
    s="Private constructor , we can't create object in other class.";
    }

    void show(){
        System.out.println("a = "+ a);
        System.out.println("b =" + b);
        System.out.println("String is = " + s);
    }
    public static void main(String[] args) {
        A4 obj =new A4();
        obj.show();
        
    }
}