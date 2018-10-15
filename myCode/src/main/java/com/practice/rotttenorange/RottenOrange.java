package com.practice.rotttenorange;

import java.util.LinkedList;
import java.util.Queue;


public class RottenOrange
{
    static Node getRottenNode( Node currentNode, int matrix[][], Direction direction, int r, int c )
    {
        if ( currentNode == null || matrix == null ) {
            return null;
        } else {
            //LookLeft
            if ( direction.getDirection().equals( "LEFT" ) ) {
                if ( currentNode.j > 0 && matrix[currentNode.i][currentNode.j - 1] == 1 ) {
                    matrix[currentNode.i][currentNode.j - 1] = 2;
                    return new Node( currentNode.i, currentNode.j - 1 );
                } else {
                    return null;
                }
            }
            //LookRight
            else if ( direction.getDirection().equals( "RIGHT" ) ) {
                if ( currentNode.j < c - 1 && matrix[currentNode.i][currentNode.j + 1] == 1 ) {
                    matrix[currentNode.i][currentNode.j + 1] = 2;
                    return new Node( currentNode.i, currentNode.j + 1 );
                } else {
                    return null;
                }
            }
            //up
            else if ( direction.getDirection().equals( "UP" ) ) {
                if ( currentNode.i > 0 && matrix[currentNode.i - 1][currentNode.j] == 1 ) {
                    matrix[currentNode.i - 1][currentNode.j] = 2;
                    return new Node( currentNode.i - 1, currentNode.j );
                } else {
                    return null;
                }
            }
            //DOWN
            else if ( direction.getDirection().equals( "DOWN" ) ) {
                if ( currentNode.i < r - 1 && matrix[currentNode.i + 1][currentNode.j] == 1 ) {
                    matrix[currentNode.i + 1][currentNode.j] = 2;
                    return new Node( currentNode.i + 1, currentNode.j );
                } else {
                    return null;
                }
            } else {
                System.out.println( "Invalid direction" );
            }
        }
        return null;
    }


    public static int calculateTimer( int matrix[][], int r, int c )
    {


        Queue<Node> processingQueue = new LinkedList<Node>();
        Queue<Node> dataHoldingQueue = new LinkedList<Node>();


        for ( int i = 0; i < r; i++ ) {
            for ( int j = 0; j < c; j++ ) {
                if ( matrix[i][j] == 2 ) {
                    Node node = new Node( i, j );
                    processingQueue.add( node );
                }
            }
        }
        int timer;
        for ( timer = 0; processingQueue.size() != 0 || dataHoldingQueue.size() != 0; timer++ ) {
            while ( processingQueue.size() != 0 ) {
                Node currrentNode = processingQueue.remove();
                Node leftNode = getRottenNode( currrentNode, matrix, Direction.LEFT, r, c );
                Node rightNode = getRottenNode( currrentNode, matrix, Direction.RIGHT, r, c );
                Node upNode = getRottenNode( currrentNode, matrix, Direction.UP, r, c );
                Node downNode = getRottenNode( currrentNode, matrix, Direction.DOWN, r, c );
                if ( leftNode != null ) {
                    dataHoldingQueue.add( leftNode );
                }
                if ( rightNode != null ) {
                    dataHoldingQueue.add( rightNode );
                }
                if ( upNode != null ) {
                    dataHoldingQueue.add( upNode );
                }
                if ( downNode != null ) {
                    dataHoldingQueue.add( downNode );
                }
            }
            Queue temp = processingQueue;
            processingQueue = dataHoldingQueue;
            dataHoldingQueue = temp;

        }

        return timer;

    }




    public static void main( String args[] )
    {
        //        Scanner sc = new Scanner( System.in );
        //        int to= sc.nextInt();
        //        for(int test=0;test<to;test++) {
        //            int r,c;
        //            int matrix[][]= new int[50][50];
        //            r=sc.nextInt();
        //            c = sc.nextInt();
        //            for(int i =0;i<r;i++){
        //                for(int j =0;j<c;j++){
        //                    matrix[i][j]=sc.nextInt();
        //                }
        //            }
        int r = 3, c = 3;
        int matrix[][] = { { 1, 0, 1 }, { 0, 1, 0 }, { 1, 1, 2 } };
        //  Queue<Node> queue = new LinkedList<Node>();
        boolean nonRottenFound = false;
        int time = calculateTimer( matrix, r, c );
        for ( int i = 0; i < r; i++ ) {
            for ( int j = 0; j < c; j++ ) {
                //                    if(matrix[i][j]==2){
                //                        nonRottenFound=true;
                //                    }
                System.out.println( matrix[i][j] );
            }
        }
        if ( nonRottenFound == true ) {
            System.out.println( "-1" );
        } else {
            System.out.println( ( time - 1 ) );
        }
    }
}

