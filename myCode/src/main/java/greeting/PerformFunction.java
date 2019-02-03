package greeting;

import java.util.function.Predicate;


public class PerformFunction
{
    static boolean fun( String name, Predicate<String> checker )
    {
        if ( checker.test( name ) ) {
            return true;

        } else
            return false;
    }


    public static void main( String args[] )
    {
        String name = "ahjiraj";
        System.out.println( fun( name, x -> x.charAt( 0 ) == 'D' ) );

    }
}
