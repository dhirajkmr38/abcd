package com.practice.ScheculeManagement;

public class Test
{

    public static void main( String args[] )
    {
        Time startTime = new Time( SessionTiming.START_TIME.getTimeHH(), SessionTiming.START_TIME.getTimeMM() );
        Time lunchStartTime = new Time( SessionTiming.LUNCH_TIME.getTimeHH(), SessionTiming.LUNCH_TIME.getTimeMM() );
        Time lunchEndTime = new Time( SessionTiming.LUNCH_TIME.getTimeHH() + 1, SessionTiming.LUNCH_TIME.getTimeMM() );


        Session startSession = new Session( "Start", startTime, startTime, 0 );
        Session lunchSession = new Session( "Lunch", lunchStartTime, lunchEndTime,
            ( lunchEndTime.getHour() - lunchStartTime.getHour() ) * 60 );
      //  Time endTime = new Time()
      //  Session netWorkSession = new Session( "network Session",SessionTiming.END_TIME.timeHH );
        Session sessionpython = new Session( "Python", 45 );
        Session sessionJava= new Session( "Java", 20 );
        Tracker tracker = new Tracker();
        tracker.getSessionList().add( startSession );
        tracker.getSessionList().add( lunchSession );
        TrackerManager trackerManager = new TrackerManager();

        trackerManager.addSessionInTracker( tracker, sessionpython );
        trackerManager.addSessionInTracker( tracker,sessionJava );
    System.out.println( tracker );


    }
}
