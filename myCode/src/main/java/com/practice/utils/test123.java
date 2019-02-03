package com.practice.utils;

import java.util.ArrayList;
import java.util.ArrayList;


public class test123
{
    public static void main( String args[] )
    {

        String inp ="i am dhiraj kjdnkjsa dhiraj dksjd dhiraj ";
        ArrayList<Integer > output = new ArrayList<>(  );

        while(true){
            int firstIndex = inp.indexOf( "dhiraj" );
            if(firstIndex==-1){
                break;
            }
            else
                output.add(firstIndex);
                inp = inp.substring( firstIndex+1,inp.length() );
        }
        System.out.println(output);

    }
}
