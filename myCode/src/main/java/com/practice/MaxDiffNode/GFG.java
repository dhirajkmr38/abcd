package com.practice.MaxDiffNode;

import com.practice.pojo.Node;
import com.practice.utils.Tree1;


public class GFG
{
    public static void main( String args[] )
    {

        Tree1 t = new Tree1();
        Node root = t.getRoot();
        GFG g = new GFG();
        System.out.println( g.maxDiff( root ) );

    }


    Tracker checkEligible( Tracker leftTracker, Tracker righTracker, int data )
    {
        if ( leftTracker == null && righTracker == null ) {
            return null;
        } else if ( leftTracker == null ) {
            if ( righTracker.min > data ) {
                righTracker.min = data;
            }
            if ( righTracker.max < data ) {
                righTracker.max = data;
            }
            return righTracker;
        } else if ( righTracker == null ) {
            if ( leftTracker.min > data ) {
                leftTracker.min = data;
            }
            if ( leftTracker.max < data ) {
                leftTracker.max = data;
            }
            return leftTracker;
        } else {

            //Left
            if ( leftTracker.min > data ) {
                leftTracker.min = data;
            }
            if ( leftTracker.max < data ) {
                leftTracker.max = data;
            }

            if ( righTracker.min > data ) {
                righTracker.min = data;
            }
            if ( righTracker.max < data ) {
                righTracker.max = data;
            }
            int diff1 = leftTracker.max - leftTracker.min;
            int diff2 = righTracker.max - righTracker.min;
            if ( diff1 > diff2 )
                return leftTracker;
            else
                return righTracker;

        }

    }


    Tracker recur( Node root )
    {
        if ( root == null )
            return null;

        if ( root.left == null && root.right == null ) {
            Tracker tracker = new Tracker();
            tracker.min = root.data;
            tracker.max = root.data;
            return tracker;
        }

        Tracker leftTracker = recur( root.left );
        Tracker rightTracker = recur( root.right );
        return checkEligible( leftTracker, rightTracker, root.data );
    }


    int maxDiff( Node root )
    {

        Tracker tracker = recur( root );

        return tracker.max - tracker.min;
    }
}
