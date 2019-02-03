package com.practice.pojo;

import java.util.ArrayList;
import java.util.List;


public class AlienDictonary
{

    static WordMapping getOneDifferenceMap( String input1, String input2 )
    {

        if ( input1.length() != input2.length() )
            return null;
        WordMapping wordMapping = new WordMapping();
        int totalDifferenceCount = 0;
        for ( int i = 0; i < input1.length(); i++ ) {
            if ( input1.charAt( i ) == input2.charAt( i ) )
                continue;

            else {
                ++totalDifferenceCount;
                if ( totalDifferenceCount > 1 )
                    return null;
                wordMapping.source = input1.charAt( i ) - 'a';
                wordMapping.destination = input2.charAt( i ) - 'a';

            }

        }
        return wordMapping;
    }


    static List<WordMapping> createMap( String[] input )
    {
        List<WordMapping> list = new ArrayList<>();
        for ( int i = 0; i < input.length - 1; i++ ) {
            for ( int j = i + 1; j < input.length; j++ ) {
                if ( input[i].charAt( 0 ) != input[j].charAt( 0 ) ) {
                    list.add( new WordMapping( input[i].charAt( 0 ) - 'a', input[j].charAt( 0 ) - 'a' ) );
                }
            }
        }

        for ( int i = 0; i < input.length - 1; i++ ) {
            for ( int j = i + 1; j < input.length; j++ ) {
                WordMapping wordMapping = getOneDifferenceMap( input[i], input[j] );
                if ( wordMapping != null )
                    list.add( wordMapping );
            }
        }

            return list;
        }
        static String convertToString ( int input[] )
        {
            StringBuffer sb = new StringBuffer();
            for ( int i = 0; i < input.length; i++ ) {
                if ( input[i] == -1 )
                    continue;
                char c = (char) ( input[i] + 97 );
                sb.append( c );

            }

            return sb.toString();
        }

        public static void main ( String args[] )
        {
            // String input[] = { "daa", "aaa", "aba", "caa" };
            //   String input[] ={ "baa", "abcd", "abca", "cab", "cad" };
            // String input[]={"caa","aaa","aab"};
            String input[] = { "aba", "bba", "aaa" };
            List<WordMapping> map = createMap( input );
            ArrayList graph[] = new ArrayList[26];
            for ( WordMapping mapping : map ) {
                int firstNode = mapping.source;
                int seconNode = mapping.destination;
                if ( graph[firstNode] == null ) {
                    graph[firstNode] = new ArrayList();
                }
                if ( graph[seconNode] == null )
                    graph[seconNode] = new ArrayList();
                graph[firstNode].add( mapping.destination );
            }

            //  printAdjaceyMatrix( graph );

            int response[] = TopologicalOrder.topoSort( graph, 26, false );
            int response1[] = TopologicalOrder.topoSort( graph, 26, true );
            String output1 = convertToString( response );
            String output2 = convertToString( response1 );

            if ( output1.equals( output2 ) ) {
                for ( int i = 0; i < output2.length(); i++ )
                    System.out.print( output1.charAt( i ) + " " );
            } else {
                System.out.println( "INVALID" );
            }


        }


        static void printAdjaceyMatrix ( ArrayList graph[] )
        {
            System.out.println( "Adjaceny list" );
            int counter = 0;
            for ( ArrayList list : graph ) {

                System.out.print( counter + "->" );
                System.out.println( list );
                ++counter;
            }
        }
    }
