package com.practice.pojo;

import java.util.ArrayList;


public class Graph
{
    int v;
    int e;

    ArrayList<Integer>[] edges;


    public Graph( int v, int e )
    {
        this.v = v;
        this.e = e;

        edges = new ArrayList[v];
        for ( int i = 0; i < v; i++ ) {
            edges[i] = new ArrayList<Integer>();
        }
    }


    public void addEdge( int u, int v )
    {
        edges[u].add( v );
    }

}