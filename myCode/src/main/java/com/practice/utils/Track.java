package com.practice.utils;

import java.util.ArrayList;
import java.util.List;


public class Track
{
    List<TrainSchedule> trainScheduleList;


    public Track()
    {
        this.trainScheduleList = new ArrayList<>();
        trainScheduleList.add( new TrainSchedule( 0,0 ) );
        trainScheduleList.add( new TrainSchedule( 2400, 2400 ) );
    }


    boolean canTrackScheduleFitTrackSchedule( TrainSchedule trainSchedule, int index )
    {
        int stoppageTime = trainSchedule.departureTime - trainSchedule.arrivalTime;

        TrainSchedule firstSchedule = getTrainScheduleList().get( index );
        TrainSchedule secondSchedule = getTrainScheduleList().get( index + 1 );
        if ( ( secondSchedule.arrivalTime - firstSchedule.departureTime ) >= stoppageTime && trainSchedule.arrivalTime>=firstSchedule.departureTime && trainSchedule.departureTime<=secondSchedule.arrivalTime ) {
            return true;
        }
        return false;

    }


    boolean addTrainOnTrack( TrainSchedule trainSchedule )
    {
        int placeTofit = -1;
        for ( int i = 0; i < getTrainScheduleList().size()-1; i++ ) {
            if ( canTrackScheduleFitTrackSchedule(trainSchedule,i) ) {
                placeTofit = i;
                break;
            }
        }
        if ( placeTofit != -1 ) {
            getTrainScheduleList().add( placeTofit +1, trainSchedule );
            return true;
        }
        return false;

    }


    public List<TrainSchedule> getTrainScheduleList()
    {
        return trainScheduleList;
    }


    public void setTrainScheduleList( List<TrainSchedule> trainScheduleList )
    {
        this.trainScheduleList = trainScheduleList;
    }


    @Override public String toString()
    {
        return "Track{" + "trainScheduleList=" + trainScheduleList + '}';
    }
}