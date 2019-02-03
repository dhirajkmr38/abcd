import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class GFGtEST
{

    static Map<Integer, Integer> map = new HashMap<>();


    static int fun( int n )
    {
        if ( map.containsValue( n ) ) {

            return map.get( n );
        }
        else if ( n == 1 ) {
            return 2;
        } else if ( n == 2 ) {
            return 3;
        } else {
            int result = fun( n - 1 ) + fun( n - 2 );
            map.put( n, result );
            return result;
        }
    }



    public static void main( String arg[] )
    {

        Scanner sc = new Scanner( System.in );
        int test = sc.nextInt();
        for(int to=0;to<test;to++){
            int number = sc.nextInt();
            System.out.println(fun(number));
        }
    }
}
