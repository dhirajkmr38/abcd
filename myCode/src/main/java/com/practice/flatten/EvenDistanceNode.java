package com.practice.flatten;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenDistanceNode {
    static int counter = 0;
    static int visited[];

    static void recur(ArrayList<Integer> graph[], int targetNode, int currentDistance) {


        ArrayList targetNodeList = graph[targetNode];
        for (int i = 0; i < targetNodeList.size(); i++) {
            targetNode = (int) targetNodeList.get(i);
            if (visited[targetNode] == 1)
                continue;
            visited[targetNode] = 1;
          //  System.out.print(targetNode + " ");
            if(currentDistance%2==0)
                ++counter;
            recur(graph, targetNode, currentDistance + 1);
        }


    }


    public static void main(String ar[]) {


        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test != 0) {
            --test;
            int nodes = sc.nextInt();
            ArrayList<Integer> graph[] = new ArrayList[nodes + 1];
            for (int i = 1; i <= nodes; i++) {
                graph[i] = new ArrayList<Integer>();

            }

            for (int i = 1; i <= nodes - 1; i++) {

                int a = sc.nextInt();
                int b = sc.nextInt();
                ArrayList list = graph[a];
                list.add(b);
                ArrayList list1 = graph[b];
                list1.add(a);
            }

            for (int i = 1; i <= nodes; i++) {
                ArrayList list = graph[i];
                System.out.print(i);
                for (Object a : list) {
                    System.out.print("-> " + a.toString());
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 1; i <= nodes; i++) {
                visited = new int[nodes + 1];
                visited[i]=1;
                recur(graph, i, 1);


            }

            System.out.println(counter/2);
        }

    }
}