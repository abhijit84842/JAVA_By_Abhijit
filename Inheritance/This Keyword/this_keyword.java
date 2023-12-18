class A7{
    int a= 50;      // instance Variable..

    void getshow(int a){        // int a is local variable
        
        System.out.println(a);        // print local variable
        System.out.println(this.a);     // print instance variable
    }
}
class this_keyword{
    public static void main(String[] args) {
        A7 obj = new A7();
        obj.getshow(20);
    }
}