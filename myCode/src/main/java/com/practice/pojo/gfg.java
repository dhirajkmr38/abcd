package com.practice.pojo;

import java.util.List;


class gfg
{
    public int recur( Graph g, int src, int des )
    {

        List<Integer> neigbhourList = g.edges[src];
        for ( int node : neigbhourList ) {
            if ( node == des ) {
                System.out.println( "Path found" );
                continue;
            } else {
                recur( g, node, des );
            }

        }
        return 0;
    }


    public int pathCount( Graph g, int src, int des )
    {

        recur( g, src, des );

        return 0;
    }
}