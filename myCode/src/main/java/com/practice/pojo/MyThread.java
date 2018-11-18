package com.practice.pojo;

public class MyThread extends Thread
{
    @Override public void run()
    {
        while ( true ) {
            System.out.println( "HE" );

            if ( Thread.currentThread().isInterrupted() ) {
                System.out.println( "Interrupted" );
                break;
            }
        }
    }
}
