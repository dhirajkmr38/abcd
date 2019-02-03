package com.practice.ScheculeManagement;

import java.util.LinkedList;


public class TrackerManager
{

    boolean addSessionInTracker( Tracker tracker, Session session )
    {
        int indexOfGap = -1;
                for ( int i = 0; i < tracker.getSessionList().size() - 1; i++ ) {
                    Session firstSession = tracker.getSessionList().get( i );
                    Session secondSession = tracker.getSessionList().get( i + 1 );
                    if ( canFitdurationBetweenSessions( firstSession.endTime, secondSession.startTime,
                        session.durationInMinutes ) ) {
                        System.out.println( "Successfully added to the Tracker" );
                        indexOfGap = i;
                        session.setStartTime( firstSession.getEndTime() );
                        session.setEndTime( Time.addMinutesToTime( firstSession.getEndTime(), session.durationInMinutes ) );
                        break;


                    }
                }

        if ( indexOfGap > -1 ) {
            tracker.getSessionList().add( indexOfGap + 1, session );
        }
        return false;

    }


    private boolean canFitdurationBetweenSessions( Time startTime, Time endTime, int duration )
    {

        if ( Time.getTimeDiffInMinutes( startTime, endTime ) >= duration ) {
            return true;
        }
        return false;

    }

}


enum SessionTiming
{
    START_TIME( 9, 0 ), LUNCH_TIME( 13, 0 ), END_TIME( 17, 0 );
    int timeHH;
    int timeMM;


    SessionTiming( int timeHH, int timeMM )
    {
        this.timeHH = timeHH;
        this.timeMM = timeMM;
    }


    public int getTimeHH()
    {
        return timeHH;
    }


    public int getTimeMM()
    {
        return timeMM;
    }
}