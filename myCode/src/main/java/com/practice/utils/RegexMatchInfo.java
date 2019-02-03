package com.practice.utils;

public class RegexMatchInfo
{
    String matchedString;
    int startindex;
    int endIndex;


    public RegexMatchInfo( String matchedString )
    {
        this.matchedString = matchedString;

    }


    public RegexMatchInfo( String matchedString, int startindex, int endIndex )
    {
        this.matchedString = matchedString;
        this.startindex = startindex;
        this.endIndex = endIndex;
    }


    public String getMatchedString()
    {
        return matchedString;
    }


    public void setMatchedString( String matchedString )
    {
        this.matchedString = matchedString;
    }


    public int getStartindex()
    {
        return startindex;
    }


    public void setStartindex( int startindex )
    {
        this.startindex = startindex;
    }


    public int getEndIndex()
    {
        return endIndex;
    }


    public void setEndIndex( int endIndex )
    {
        this.endIndex = endIndex;
    }


    @Override public boolean equals( Object o )
    {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;

        RegexMatchInfo that = (RegexMatchInfo) o;

        return matchedString != null ? matchedString.equals( that.matchedString ) : that.matchedString == null;
    }


    @Override public int hashCode()
    {
        return matchedString != null ? matchedString.hashCode() : 0;
    }


    @Override public String toString()
    {
        return matchedString;
    }
}
