package com.practice.rotttenorange;

import java.util.Stack;


public class PoisousPesiticide
{
    static void cleanUpStack( Stack<StackNode> stack )
    {
        if ( stack.size() == 0 ) {
            return;
        } else {
            StackNode currentNode = stack.pop();
            cleanUpStack( stack );
            if ( currentNode.markForDelete == false ) {
                stack.push( currentNode );
            }
        }
    }


    static boolean markUpStack( Stack<StackNode> stack )
    {
        if ( stack.size() == 0 ) {
            return false;
        } else {
            StackNode currentNode = stack.pop();
            boolean status = markUpStack( stack );
            if ( stack.size() == 0 ) {
                stack.push( currentNode );
            } else if ( stack.peek().data < currentNode.data ) {
                currentNode.markForDelete = true;
                stack.push( currentNode );
                status = true;

            } else {
                stack.push( currentNode );

            }
            return status;
        }
    }


    static int poisonousPlants( int[] p )
    {
        Stack<StackNode> s1 = new Stack();
        boolean isDirty = false;
        for ( int i = 0; i < p.length; i++ ) {
            if ( s1.size() == 0 ) {
                s1.push( new StackNode( p[i], false ) );
            } else {
                StackNode stackNode = s1.peek();
                if ( stackNode.data >= p[i] ) {
                    s1.push( new StackNode( p[i], false ) );
                } else {
                    isDirty = true;
                    s1.push( new StackNode( p[i], true ) );
                }

            }
        }
        System.out.println( s1 );

        if ( isDirty == true ) {
            int timer;
            for ( timer = 1; isDirty == true; timer++ ) {
                cleanUpStack( s1 );
                isDirty = markUpStack( s1 );
                System.out.println( s1 );
                if ( isDirty == true ) {
                    cleanUpStack( s1 );
                } else {
                    break;
                }

            }
            return timer;
        } else {
            return 0;
        }


    }


    public static void main( String argd[] )
    {
        int inp[] = { 3, 6, 2, 7, 5 };
        System.out.println( poisonousPlants( inp ) );
    }
}
