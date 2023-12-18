interface CustomerRaju{
    int rice=5; // public + static + final
    void purches(); // public + abstract
}
class ShellerAbhijit implements CustomerRaju{
    @Override
    public void purches(){
            //rice=7;   // we can't change the interface value, so it is final
            System.out.println("Raju need " + rice +" kg rice");
    }
}
public class interfacecls{
    public static void main(String[] args) {
        ShellerAbhijit obj=new ShellerAbhijit();
        obj.purches();

        System.out.println(CustomerRaju.rice);      // interface variable did not depend on object . so it is Static

    }
}
