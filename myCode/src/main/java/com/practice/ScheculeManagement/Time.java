package com.practice.ScheculeManagement;

import java.util.Objects;


public class Time
{
    int hour;
    int minute;


    public Time( int hour, int minute )
    {
        this.hour = hour;
        this.minute = minute;
    }


    static int getTimeDiffInMinutes( Time firstTime, Time secondTime )
    {

        int hourDiff = secondTime.getHour() - firstTime.getHour();
        int minDiff = secondTime.getMinute() - firstTime.getMinute();
        return minDiff + 60 * hourDiff;

    }


    static Time addMinutesToTime( Time time, int duration )
    {


        int minutes = time.getMinute() + duration;
        int extraHr = minutes / 60;
        minutes = minutes % 60;
        return new Time( time.getHour() + extraHr,minutes);
    }


    static int getTimeInMinutes( Time time )
    {
        return time.getMinute() + time.getHour() * 60;
    }


    public int getHour()
    {
        return hour;
    }


    public void setHour( int hour )
    {
        this.hour = hour;
    }


    public int getMinute()
    {
        return minute;
    }


    public void setMinute( int minute )
    {
        this.minute = minute;
    }


    @Override public String toString()
    {
        return "Time{" + "hour=" + hour + ", minute=" + minute + '}';
    }


    @Override public boolean equals( Object o )
    {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;
        Time time = (Time) o;
        return hour == time.hour && minute == time.minute;
    }


    @Override public int hashCode()
    {
        return Objects.hash( hour, minute );
    }


    public static void main( String args[] )
    {
        Time time = new Time( 12, 56 );
        System.out.println( time.addMinutesToTime( time, 4 ) );

    }
}
