package com.practice.utils;


import java.util.ArrayList;
import java.util.Scanner;


public class TopologicalSorting
{




    public static void main(String ar[]){

        Scanner sc = new Scanner( System.in );
        int test = sc.nextInt();
        while(test!=0){
            --test;
            int vertex = sc.nextInt();
            int edges = sc.nextInt();
            ArrayList<Integer> graph[] = new ArrayList[vertex];
            for(int i =0;i<vertex;i++){
                graph[i]= new ArrayList<Integer>(  );

            }
           while(edges!=0){
               --edges;
               int a= sc.nextInt();
               int b = sc.nextInt();
               ArrayList firstList = graph[a];
               firstList.add( b );
               ArrayList secondList = graph[b];
               secondList.add( a );
           }

            for(int i =0;i<vertex;i++){
             ArrayList list = graph[i];
                System.out.print(i+ "-> ");
             for( Object a :list){
                 System.out.print(a.toString()+"->");
             }
                System.out.println();
            }
        }


    }

}
