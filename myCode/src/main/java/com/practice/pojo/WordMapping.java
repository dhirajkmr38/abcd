package com.practice.pojo;

public class WordMapping
{

    int source;
    int destination;


    public WordMapping()
    {
    }


    public WordMapping( int source, int destination )
    {
        this.source = source;
        this.destination = destination;
    }


    @Override public String toString()
    {
        return "WordMapping{" + "source=" + source + ", destination=" + destination + '}';
    }
}

