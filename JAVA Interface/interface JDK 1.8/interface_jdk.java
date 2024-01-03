// jdk 1.8 proved that interface is not 100% pure abstract
// Add new features Default and Static method...

interface A1 {
    void a1(); // public + abstract

    void a2(); // public + abstract

    // add a new method
    default void a3() { // void a3() is not abstract , it is default
        System.out.println("This is a3() and we add this method in updated version");
    }
}

class Ram implements A1 {
    @Override
    public void a1() {
        System.out.println("This is class Ram a1()");
    }

    @Override
    public void a2() {
        System.out.println("This is class Ram a2()");
    }

}

class Sam implements A1 {
    @Override
    public void a1() {
        System.out.println("This is class sam a1()");
    }

    @Override
    public void a2() {
        System.out.println("This is class sam a2()");
    }
}

public class interface_jdk {

    public static void main(String[] args) {
        Ram obj1 = new Ram();
        Sam obj2 = new Sam();

        obj1.a1();
        obj1.a2();
        obj1.a3(); // we can call a3() method

        obj2.a1();
        obj2.a2();
    }
}
