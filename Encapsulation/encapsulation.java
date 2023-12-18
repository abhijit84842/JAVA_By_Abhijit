class encap{
    private int value;      // class variable(data hiding)
    public int  getsetValue(int x){    // class method (data abstraction)
        int value=x;
        return value;
    }
/* 
    // we can also write to return the value...
    public int getvalue(){
        return value;
    } */
}
class encapsulation{
    public static void main(String[] args) {
        encap obj = new encap();
        System.out.println(obj.getsetValue(20));
       // System.out.println(obj.getvalue());
    }
}