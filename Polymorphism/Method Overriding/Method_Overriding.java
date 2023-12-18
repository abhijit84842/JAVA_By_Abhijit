class BMW{

    void music(){
        System.out.println("Sony Normal 2 speaker Music System..");
    }

     void airbag(){
        int bag= 6;
        System.out.println(bag);
    }
    void Ac(){
        System.out.println("Built in Air Condition..");
    }
    
    void AI(){
        System.out.println("Auto pilot System..");
    }

}

class Tata extends BMW{
    void EVM(){
        System.out.println("No fuel , Only Charging..");
    }
    @Override
    void music(){
        super.music();
    }
}

class Method_Overriding{
    public static void main(String[] args) {
        Tata obj = new Tata();

        obj.EVM();
        obj.AI();
        obj.Ac();
        obj.airbag();
        obj.music();   

    }
}