package com.practice.ScheculeManagement;

import java.util.LinkedList;
import java.util.List;


public class Tracker
{
    List<Session> sessionList;


    public Tracker()
    {
        this.sessionList = new LinkedList<>(  );
    }


    public List<Session> getSessionList()
    {
        return sessionList;
    }


    public void setSessionList( List<Session> sessionList )
    {
        this.sessionList = sessionList;
    }


    @Override public String toString()
    {
        return "Tracker{" + "sessionList=" + sessionList + '}';
    }
}