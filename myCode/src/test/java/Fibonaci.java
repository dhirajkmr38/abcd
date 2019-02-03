import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.math.BigInteger;
import java.net.Inet4Address;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;


public class Fibonaci
{
    static Map<Integer, String> map = new HashMap<>();


    static String fun( int n )
    {
        if ( map.containsKey( n ) ) {
            return map.get( n ).toString();
        } else if ( n == 1 ) {
            return "2";
        } else if ( n == 2 ) {
            return "3";
        } else {
            String result = String.valueOf( new BigInteger( fun( n - 1 ) ).add( new BigInteger( fun( n - 2 ) ) ) );
            map.put( n, result );
            if ( result.compareTo( "1000000007" ) >= 0 ) {
                BigInteger big = new BigInteger( result );
                BigInteger mod = new BigInteger( "1000000007" );
                big = big.mod( mod );
                return big.toString();

            }
            return result;
        }
    }


    public static void main( String ar[] )
    {
        System.out.println( fun( 2 ) );
        System.out.println( fun( 3 ) );
        System.out.println( fun( 4 ) );
        System.out.println( fun( 5 ) );
        System.out.println( fun( 6 ) );
        System.out.println( fun( 7 ) );
        System.out.println( fun( 8 ) );
        System.out.println( fun( 9 ) );
        System.out.println( fun( 10 ) );
        System.out.println( fun( 40 ) );
        System.out.println( fun( 48 ) );
        System.out.println( fun( 91 ) );
        System.out.println( fun( 100 ) );
        BigInteger integer = new BigInteger( "123333333332323232333331111111111111111111111111111111111111111113333333" );
        BigInteger integer1 = new BigInteger( "122232328989898989893232323232" );
        System.out.println( integer.multiply( integer1 ) );

    }
}
