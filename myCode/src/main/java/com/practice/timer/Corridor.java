package com.practice.timer;

import java.util.Timer;
import java.util.TimerTask;


public class Corridor
{
    String currentState;
    Timer timer;

public Corridor(){
    timer = new Timer(  );
}
    public void enablePowerSavingMode()
    {

        currentState = "PowerSavingMode";
        System.out.println( "Chnging to " + currentState );
        System.out.println( "Reseting previous set timer :"+System.currentTimeMillis() );
        timer.cancel();
        timer = new Timer();
        timer.schedule( new TimerTask()
        {
            @Override public void run()
            {
                disablePowerSavingMode();
                timer.cancel();
            }
        }, 10000 );
    }


    public void disablePowerSavingMode()
    {
        System.out.println("Changing to normal Mode : " +System.currentTimeMillis());
        currentState = "Normal Mode";

    }
}

