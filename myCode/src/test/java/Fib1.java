


public class Fib1
{

   static int fib(int num){
        if(num==0 || num==1)
            return 0;
        else if(num==2)
            return 1;
        else
            return fib(num-1)+fib( num-2 );
    }
    public static void main(String arg){
        System.out.println(fib(10));
    }
}
