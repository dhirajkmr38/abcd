package com.practice.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;


public class StringUtils
{
    final static int timeOut = 5000;
    private static ExecutorService executorService = Executors.newFixedThreadPool( 2 );


    public static List<String> getMatchedTokens( String input, String regex ) throws ExecutionException, InterruptedException
    {
        RegexMatcherThread regexMatcherThread = new RegexMatcherThread( regex, input );
        List<String> response = null;
        Future future = null;
        try {
            future = executorService.submit( regexMatcherThread );
            response = (List<String>) future.get( timeOut, TimeUnit.MILLISECONDS );
        } catch ( TimeoutException e ) {
            System.out.println( "HEllo" );
            e.printStackTrace();
            future.cancel( true );
        }

        return response;
    }


    public static void main( String arg[] ) throws ExecutionException, InterruptedException
    {

        // = getMatchedTokens( "000000000000", "(0*)*A" );
        Map<String, String> map = new HashMap<String, String>();
        map.put( "0000000000000000000000000000000000000000000000000000000000000000", "(0*)*A" );
        map.put( "000000000000000000000000000000000000000000000000000000000000000011", "(0*)*B" );
        map.put( "abcdd", "[a-c]" );
        map.put( "acdc", "[c-d]" );
        map.put( "sa21", "12" );
        map.put( "sa211", "12q" );
        map.put( "sa212", "21" );
        map.put( "sa213", "21" );
        map.put( "sa214", "21" );

        for ( Map.Entry<String, String> e : map.entrySet() ) {
            String key = e.getKey();
            String value = e.getValue();
            List<String> response = getMatchedTokens( key, value );

            System.out.println( response );
        }

        executorService.shutdownNow();
    }

}
