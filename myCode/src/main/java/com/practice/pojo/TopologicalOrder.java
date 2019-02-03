package com.practice.pojo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;


public class TopologicalOrder
{   static int visited[] = new int[100];
    static Stack<Integer> stack = new Stack<>();
    static Set<Integer> set = new HashSet<>(  );
    static void recur ( ArrayList<Integer> graph[],int N,int targetNode,boolean revert){

        //  System.out.println("Current Node "+targetNode+" ");
        if(graph[targetNode]==null)
            return;
        ArrayList targetNodeList = graph[targetNode];

        if(targetNodeList.size()==0  && set.contains( targetNode )==false){
            //    System.out.println("Zero size pushed in stack"+targetNode);
            set.add(targetNode);
            stack.push(targetNode);
            return;
        }
        else{


            int parentIndex= targetNode;
            if(revert==false) {
                for ( int i = 0; i < targetNodeList.size(); i++ ) {
                    targetNode = (int) targetNodeList.get( i );
                    if ( visited[targetNode] == 1 ) {
                        continue;
                    }
                    visited[targetNode] = 1;
                    recur( graph, N, targetNode ,revert);

                }
            }
            else{

                for ( int i =  targetNodeList.size()-1; i >=0; i-- ) {
                    targetNode = (int) targetNodeList.get( i );
                    if ( visited[targetNode] == 1 ) {
                        continue;
                    }
                    visited[targetNode] = 1;
                    recur( graph, N, targetNode ,revert);
                }
            }
            if(set.contains( parentIndex )==false){
                set.add(parentIndex);
                stack.push(parentIndex);

            }
        }
    }
    public static int[] topoSort(ArrayList<Integer> graph[],int N,boolean revert)
    {   if(revert){
        visited[N-1]=1;
        for(int i = N-1;i>=0;i--){
            recur(graph,N,i,revert);
        }
    }
    else {
        visited[0] = 1;
        for ( int i = 0; i < N; i++ ) {
            recur( graph, N, i,revert );
        }
    }

        int list[]= new int[50];
        for(int i=0;i<list.length;i++){
            list[i]=-1;
        }
        int index=0;

        while(stack.empty()!=true){
            list[index]=stack.pop();
            ++index;
        }
        for(int i =0;i<index;i++){
            //   System.out.print(list[i]+" ");
        }
        set = new HashSet<>();
        visited= new int[100];

        return list;
    }

}