package com.practice.utils;

import java.util.ArrayList;
import java.util.List;


public class TrackTimingManager
{

    List<Track> trackList;


    public TrackTimingManager()
    {
        this.trackList = new ArrayList<>(  );
    }


    public void addTrainSchedule( TrainSchedule trainSchedule )
    {


        for ( Track track : trackList ) {
            if ( track.addTrainOnTrack( trainSchedule ) == true ) {
                System.out.println( "Successfully added on track" );
                return;
            }
        }
        System.out.println( "Creating a new track to fit the schedule" );
        createAndaddSchedule( trainSchedule );
    }


    private void createAndaddSchedule( TrainSchedule trainSchedule )
    {
        Track newtrack = new Track();
        if ( !newtrack.addTrainOnTrack( trainSchedule ) ) {
            System.out.println( "Could not add" );

        }
        getTrackList().add( newtrack );

    }


    private List<Track> getTrackList()
    {
        return trackList;
    }


    @Override public String toString()
    {
        return "\nTrackTimingManager{" + "trackList=" + trackList + '}';
    }
}
