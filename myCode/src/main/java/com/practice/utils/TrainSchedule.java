package com.practice.utils;

public class TrainSchedule  implements Schedule
{
    int arrivalTime;
    int departureTime;


    public TrainSchedule( int arrivalTime, int departureTime )
    {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }


    @Override public String toString()
    {
        return "TrainSchedule{" + "arrivalTime=" + arrivalTime + ", departureTime=" + departureTime + '}';
    }
}

