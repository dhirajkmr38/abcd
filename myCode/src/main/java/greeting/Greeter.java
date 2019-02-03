package greeting;

import java.util.function.Predicate;


public class Greeter
{
    public static void main( String arg[] )
    {
        Greeter greeter = new Greeter();
        greeter.greet( () -> {
            System.out.println( "Hello in greeting" );
            return "Hello from greeting ";
        } );
        greeter.greet( GreetingImpl::perform );
        Greeting1 gre = () -> System.out.println( "Greeting " );
        gre.second();
        Predicate<Integer> predicate1 = x -> x < 10;
        Predicate<Integer> predicate2 = x -> x > 10;
        if ( predicate1.or( predicate2 ).or( predicate1 ).test( 0 ) ) {
            System.out.println( "Hello" );
        }

    }


    public void greet( Greeting greeting )
    {
        System.out.println( greeting.perform() );

    }

}
