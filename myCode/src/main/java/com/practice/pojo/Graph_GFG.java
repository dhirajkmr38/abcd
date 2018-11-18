package com.practice.pojo;

import java.util.Scanner;


public class Graph_GFG
{

    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int v = sc.nextInt();
            int e = sc.nextInt();

            Graph g = new Graph( v, e );

            for ( int i = 0; i < e; i++ ) {
                g.addEdge( sc.nextInt(), sc.nextInt() );
            }

            gfg obj = new gfg();
            System.out.println( obj.pathCount( g, sc.nextInt(), sc.nextInt() ) );
        }
    }
}
