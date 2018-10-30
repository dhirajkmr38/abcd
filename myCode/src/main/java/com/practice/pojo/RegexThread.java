package com.practice.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;


public class RegexThread
{


    public static void main( String arg[] ) throws InterruptedException, ExecutionException
    {
        RegexMatcherThread rx0 = new RegexMatcherThread( "[0-2]", "abcd123" );
        RegexMatcherThread rx1 = new RegexMatcherThread( "[2-4]", "abcd1232123214" );
        RegexMatcherThread rx2 = new RegexMatcherThread( "[4-6]", "abcd123546575" );
        RegexMatcherThread rx3 = new RegexMatcherThread( "[6-8]", "abcd123543657" );
        RegexMatcherThread rx4 = new RegexMatcherThread( "(0*)*A", "000000" );
        RegexMatcherThread rx5 = new RegexMatcherThread( "[a-b]", "abcd12353464576" );
        ExecutorService executorService = Executors.newFixedThreadPool( 4 );
        List<Callable<RegexMatcherThread>> threadList = new ArrayList<Callable<RegexMatcherThread>>();
        threadList.add( rx0 );
        threadList.add( rx1 );
        threadList.add( rx2 );
        threadList.add( rx3 );
        threadList.add( rx4 );
        threadList.add( rx5 );
        List<Future<RegexMatcherThread>> futures = executorService.invokeAll( threadList );


        System.out.println( Thread.activeCount() );
        for ( Future<RegexMatcherThread> fut : futures )
            System.out.println( fut.get() );

    }


}
