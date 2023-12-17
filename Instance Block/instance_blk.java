class A6{
    A6(){           // constructor
        int a ;
        int b ; 
        a=20;
        b=30;
        System.out.println(a +" " +b);
    }
    // instance block..
    {
        int c=40;
        int d= 50;
        System.out.println("This is the instance block...");
        System.out.println(c + " " +d);
    }
}

class instance_blk{
    public static void main(String[] args) {
        A6 obj = new A6();
    }
}