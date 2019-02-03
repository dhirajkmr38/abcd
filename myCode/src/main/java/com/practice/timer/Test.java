package com.practice.timer;

public class Test
{


    public static void main(String args[]) throws InterruptedException
    {
        Corridor corridor = new Corridor();


        int counter =2;
        while(counter!=0) {
            --counter;
            System.out.println("Time at which motion detected : "+System.currentTimeMillis());
            corridor.enablePowerSavingMode();
            Thread.currentThread().sleep( 2000 );
            System.out.println("Counter"+counter);
        }
    }
}
