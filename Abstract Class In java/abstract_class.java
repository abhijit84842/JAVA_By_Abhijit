abstract class Animal{      // abstract class..
   public abstract void sound();  // abstract method
}
class Dog extends Animal{
    @Override
    public void sound(){       // use the abstract class in sub classes..
        System.out.println("Dog is barking....");
    }
}

class Tiger extends Animal{
    @Override
    public void sound(){
        System.out.println("Tiger is Roar...");
    }
}

class abstract_class{
    public static void main(String[] args) {
        Dog obj = new Dog();
        Tiger obj1 = new Tiger();
        obj.sound();
        obj1.sound();
    }
}