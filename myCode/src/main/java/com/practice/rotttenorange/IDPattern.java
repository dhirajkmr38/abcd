package com.practice.rotttenorange;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class IDPattern
{
    static Stack<Integer> getElement( Queue<Integer> queue, int counter )
    {
        Stack<Integer> stack = new Stack<Integer>();
        while ( counter != 0 ) {
            int item = queue.poll();
            stack.push( item );
            --counter;
        }

        return stack;
    }


    static void println( Stack<Integer> stack )
    {
        while ( stack.isEmpty() == false ) {
            System.out.print( stack.pop() );
        }
    }


    public static void main( String args[] )
    {
        Scanner sc = new Scanner( System.in );
        int test = sc.nextInt();
        for ( int to = 0; to < test; to++ ) {

            String inp = sc.next();
            Queue<Integer> queue = new LinkedList<Integer>();
            for ( int i = 1; i < 10; i++ ) {
                queue.add( i );

            }
            int x = 0;
            if ( inp.charAt( x ) == 'I' ) {
                System.out.print( queue.poll() );


            } else {
                int counter = 0;
                while ( x < inp.length() && inp.charAt( x ) == 'D' ) {
                    ++counter;
                    ++x;
                }
                Stack<Integer> list = getElement( queue, counter + 1 );
                println( list );

            }
            for ( int i = x; i < inp.length(); i++ ) {
                if ( inp.charAt( i ) == 'I' ) {

                    if ( i < inp.length() - 1 && inp.charAt( i + 1 ) == 'D' ) {
                        int j = i + 1;
                        int counter = 0;
                        while ( j < inp.length() && inp.charAt( j ) == 'D' ) {
                            ++counter;
                            ++j;
                        }
                        Stack<Integer> list = getElement( queue, counter + 1 );
                        println( list );
                        i = j - 1;
                    } else {
                        println( getElement( queue, 1 ) );
                    }

                } else {
                    //Dqueue
                    int counter = 0;
                    int j = i + 1;
                    while ( j < inp.length() && inp.charAt( j ) == 'D' ) {
                        ++counter;
                        ++j;
                    }
                    Stack<Integer> list = getElement( queue, counter );
                    println( list );
                    i = j - 1;

                }
            }

        }
    }
}