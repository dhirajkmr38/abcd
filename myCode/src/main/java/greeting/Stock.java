package greeting;

import java.util.Scanner;
import java.util.Stack;


public class Stock
{


    public static void main( String arg[] )
    {
        //  int input[] = { 5, 11, 12, 14, 13, 15, 11, 10, 9, 7 ,10};
        //   int input[] = { 1, 1, 1 };
        Scanner sc = new Scanner( System.in );
        int t0 = sc.nextInt();
        for ( int t = 0; t < t0; t++ ) {
            int input[] = new int[1000];
            int n = sc.nextInt();
            for ( int x = 0; x < n; x++ ) {
                input[x] = sc.nextInt();
            }
            Stack<Item> stack = new Stack<>();
            Boolean found = false;
            for ( int i = 0; i < input.length; i++ ) {
                if ( stack.isEmpty() == true ) {
                    stack.push( new Item( input[i], i ) );
                } else if ( stack.peek().data > input[i] ) {
                    if ( stack.size() == 1 ) {
                        stack.pop();
                        stack.push( new Item( input[i], i ) );
                    } else {
                        int endIndex = stack.peek().startIndex;
                        Item firstItem = null;
                        while ( stack.isEmpty() == false ) {
                            firstItem = stack.pop();


                        }
                        System.out.print( "(" + firstItem.startIndex + " " + endIndex + ") " );
                        found = true;
                        stack.push( new Item( input[i], i ) );
                    }
                } else if ( stack.peek().data < input[i] ) {
                    stack.push( new Item( input[i], i ) );
                }
            }
            if ( stack.empty() == false && stack.size() > 1 ) {
                int endIndex = stack.peek().startIndex;
                Item firstItem = null;
                while ( stack.isEmpty() == false ) {
                    firstItem = stack.pop();

                }
                System.out.print( "(" + firstItem.startIndex + " " + endIndex + ")" );
                found = true;

            }
            if ( found == false ) {
                System.out.println( "NO PROFIT" );
            }
        }

    }
}


class Item
{
    int data;
    int startIndex;


    public Item( int data, int startIndex )
    {
        this.data = data;
        this.startIndex = startIndex;
    }
}
