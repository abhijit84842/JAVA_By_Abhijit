interface clint{
    public abstract void webdesign();

    public abstract void development();
}

abstract class rajTech implements clint{
    @Override
    public void webdesign(){
        System.out.println("Menubar , text Button ");
    }
    // RajTech doesn't complete full task,so we need to abstract RajTech class
}
class TCS extends rajTech{
    @Override
    public void development(){
        System.out.println("PHP , JAVASCRIPT , NODE JS");
    }
}

class interface_method{
    public static void main(String[] args) {
        TCS obj = new TCS();
        obj.webdesign();
        obj.development();
    }
}