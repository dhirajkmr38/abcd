package com.practice.pojo;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexMatcherThread implements Callable
{
    String pattern;
    String input;


    public RegexMatcherThread( String pattern, String input )
    {
        this.pattern = pattern;
        this.input = input;
    }


    @Override public ArrayList<String> call()
    {
        System.out.println( Thread.currentThread().getName() + " " + pattern );
        ArrayList<String> tokens = new ArrayList<String>();
        Pattern pattern = Pattern.compile( this.pattern );
        Matcher matcher = pattern.matcher( new InterruptibleCharSequence( input ) );
        while ( matcher.find() ) {
            tokens.add( matcher.group( 0 ) );
        }
        return tokens;

    }


}
