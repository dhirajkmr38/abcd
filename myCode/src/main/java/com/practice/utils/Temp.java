package com.practice.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Temp
{
    public static void main( String ar[] )
    {
        Pattern p = Pattern.compile( "\\b(?<city>[a-z]{1,3})[ ](?<pincode>[0-9]{4})" );
        Matcher matcher = p.matcher( " pat 1234" );

        while ( matcher.find() ) {
            System.out.println( matcher.groupCount() );
            System.out.println( matcher.group( 0 ) );
            System.out.println( matcher.group( "city" ) );
        }

    }
}
