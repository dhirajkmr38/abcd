package com.practice.utils;

public class TrainTest
{


    public static void main( String args[] )
    {

        TrainSchedule t1 = new TrainSchedule( 900, 940 );
        TrainSchedule t2 = new TrainSchedule( 950, 1100 );
        TrainSchedule t3 = new TrainSchedule( 1500, 1800 );
        TrainSchedule t4 = new TrainSchedule( 910, 1200 );
        TrainSchedule t5 = new TrainSchedule( 1120, 1130 );
        TrainSchedule t6 = new TrainSchedule( 1900, 2000 );

        TrackTimingManager trackTimingManager = new TrackTimingManager();
        trackTimingManager.addTrainSchedule( t1 );
        trackTimingManager.addTrainSchedule( t2 );
        trackTimingManager.addTrainSchedule( t3 );
        trackTimingManager.addTrainSchedule( t4 );
        trackTimingManager.addTrainSchedule( t5 );
        trackTimingManager.addTrainSchedule( t6 );


        System.out.println( trackTimingManager );
        System.out.println( "Number of track required : " + trackTimingManager.trackList.size() );
    }
}
