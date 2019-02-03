package thread.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class MutliThreading
{
    static ExecutorService executor = Executors.newFixedThreadPool( 10 );


    public static void main( String arg[] )
    {

        Future future1 = executor.submit( () -> {
            System.out.println( Thread.currentThread().getName() );
            for ( int i = 0; i < 1000; i++ ) {
                for ( int j = 0; j < 10000; j++ ) {
                }
            }


        } );
        Future future2 = executor.submit( () -> {
            System.out.println( Thread.currentThread().getName() );
            for ( int i = 0; i < 10; i++ ) {
                for ( int j = 0; j < 10; j++ ) {
                }

            }
        } );

        if ( future1.isDone() && future2.isDone() ) {
            System.out.println( "Total done" );
        }

    }
}
