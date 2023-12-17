class A0{
    int age;
    String name;
    A0(){
        age = 24;
        name= "Abhijit Das";
    }
    void show(){
        System.out.println(age + " " +name);
    }
}

class Constructor{
    public static void main(String[] args) {
        A0 obj = new A0();
        obj.show();
    }
}