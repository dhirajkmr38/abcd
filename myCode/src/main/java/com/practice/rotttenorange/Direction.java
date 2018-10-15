package com.practice.rotttenorange;

public enum Direction
{
    LEFT( "LEFT" ), RIGHT( "RIGHT" ), UP( "UP" ), DOWN( "DOWN" );
    String direction;


    Direction( String direction )
    {
        this.direction = direction;
    }


    public String getDirection()
    {
        return direction;
    }
}
