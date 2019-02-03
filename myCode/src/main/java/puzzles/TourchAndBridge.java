package puzzles;

import java.util.TreeSet;


public class TourchAndBridge
{
    static int crossTimeforTogether( int p1, int p2 )
    {
        if ( p1 > p2 )
            return p1;
        else
            return p2;

    }


    static int crossBridge( TreeSet<Integer> startSide, TreeSet<Integer> endSide, boolean isSelectingFromEnd )
    {

        if ( !isSelectingFromEnd ) {
            int crossTimeforPerson1 = startSide.pollFirst();
            int crossTimeforPerson2 = startSide.pollFirst();
            endSide.add( crossTimeforPerson1 );
            endSide.add( crossTimeforPerson2 );
            return crossTimeforTogether( crossTimeforPerson1 , crossTimeforPerson2 );

        } else {
            int crossTimeforPerson1 = startSide.pollLast();
            int crossTimeforPerson2 = startSide.pollLast();
            endSide.add( crossTimeforPerson1 );
            endSide.add( crossTimeforPerson2 );
            return crossTimeforTogether( crossTimeforPerson1 , crossTimeforPerson2);
        }
    }


    static int returnBack( TreeSet<Integer> startSide, TreeSet<Integer> endSide )
    {
        if ( startSide.size() == 0 )
            return 0;
        int returnTimeForPerson = endSide.pollFirst();
        startSide.add( returnTimeForPerson );
        System.out.println( "Returning ->" + returnTimeForPerson );
        return returnTimeForPerson;
    }


    static void addInput( TreeSet input )
    {
        input.add( 1 );
        input.add( 2);
        input.add( 7);
        input.add( 9 );
//        input.add( 12 );

//        input.add( 10 );
//        input.add( 20 );
//        input.add( 30 );
    }


    public static void main( String args[] )
    {

        TreeSet<Integer> startSide = new TreeSet<>();
        addInput( startSide );
        TreeSet<Integer> endSide = new TreeSet<>();
        int totalTakenToCrossBridge = 0;
        boolean isSelectingFromEnd=false;

        while ( startSide.size() != 0 ) {

            totalTakenToCrossBridge += crossBridge( startSide, endSide, isSelectingFromEnd );
            totalTakenToCrossBridge += returnBack( startSide, endSide );
            isSelectingFromEnd = !isSelectingFromEnd;

        }
        System.out.println("Total time taken to cross Bridge"+totalTakenToCrossBridge);

    }
}
