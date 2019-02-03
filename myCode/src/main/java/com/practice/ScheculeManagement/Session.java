package com.practice.ScheculeManagement;

public class Session
{
    String description;
    Time startTime;
    Time endTime;
    int durationInMinutes;


    public Session( String description, Time startTime, Time endTime, int durationInMinutes )
    {
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.durationInMinutes = durationInMinutes;
    }


    public Session( String description, int durationInMinutes )
    {
        this.description = description;
        this.durationInMinutes = durationInMinutes;
    }


    public String getDescription()
    {
        return description;
    }


    public void setDescription( String description )
    {
        this.description = description;
    }


    public Time getStartTime()
    {
        return startTime;
    }


    public void setStartTime( Time startTime )
    {
        this.startTime = startTime;
    }


    public Time getEndTime()
    {
        return endTime;
    }


    public void setEndTime( Time endTime )
    {
        this.endTime = endTime;
    }


    public int getDurationInMinutes()
    {
        return durationInMinutes;
    }


    public void setDurationInMinutes( int durationInMinutes )
    {
        this.durationInMinutes = durationInMinutes;
    }


    @Override public String toString()
    {
        return "Session{" + "description='" + description + '\'' + ", startTime=" + startTime + ", endTime=" + endTime
            + ", durationInMinutes=" + durationInMinutes + '}';
    }
}

