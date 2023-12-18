public class method_overloading{


     public static void main(String[] args) {

        method_overloading obj =new method_overloading();

        System.out.println(obj.sum(2, 4));
        System.out.println(obj.sum(2, 4, 6));
        System.out.println(obj.sum(20.45, 60.25));
    }

    public int sum(int a , int b){
        int c=(a+b);
        return c;
    }

    public int sum(int a ,int b , int c){   // overloaded with diferent parameter..
        return (a+b+c);

    }

    public double sum(double a, double b){
        return (a+b);
    }
   
}
