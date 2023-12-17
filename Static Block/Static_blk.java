class Static_blk{

    Static_blk(){       
        System.out.println("This the constructor....");
    }
    static{     // static block...
        System.out.println("this is static block , it call automatically..");
    }
    public static void main(String[] args) {

        System.out.println("This is instance block .. it excute 2nd ");     // instance block

        Static_blk obj = new Static_blk();
    }
}