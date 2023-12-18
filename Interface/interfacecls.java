interface CustomerRaj{
    int rice =5 ;       // public + static + final 

    public abstract void purches();     // public + abstract..
}

class ShellerAyan implements CustomerRaj{
    @Override
    public void purches(){
        // rice =7;         // we can't change the interface value, so it is final
        System.out.println("Raj needs " + rice + "kg");
    }
}

class interfacecls{
    public static void main(String[] args) {
        ShellerAyan obj = new ShellerAyan();

        obj.purches();      
// interface varaibel did not depend on object , so it it static
        System.out.println(CustomerRaj.rice);

    }
}