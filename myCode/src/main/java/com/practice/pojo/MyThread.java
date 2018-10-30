package com.practice.pojo;

public class MyThread extends Thread
{
    @Override public void run()
    {
        while ( true ) {
            System.out.println( "Thread Running!" );
            try {
                Thread.sleep( 1000 );
            } catch ( InterruptedException e ) {
                e.printStackTrace();
            }
        }
    }
}
