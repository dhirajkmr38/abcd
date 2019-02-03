package com.practice.flatten;

import java.util.Scanner;

public class AdjacencyMatrix {
    static int visited[] = new int[1000];

    static public void recur(int matrix[][], int targetNode, int n) {

        for (int i = 0; i < n; i++) {
            if (visited[i] == 1 || matrix[targetNode][i] == 0 || i == targetNode)
                continue;
            visited[i] = 1;
            targetNode = i;
           // System.out.println(targetNode);
            recur(matrix, targetNode, n);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test != 0) {
            --test;

            int n = sc.nextInt();
            int matrix[][] = new int[n][n];
            int edges = sc.nextInt();
            while (edges != 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                matrix[a][b] = 1;
                matrix[b][a] = 1;
                --edges;
            }
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int i = 0; i < matrix.length; i++) {


                matrix[x][y] = 0;
                matrix[y][x] = 0;
                for (int j = 0; j < matrix.length; j++) {
                    //     System.out.print(matrix[i][j] + " ");
                }
                //   System.out.println();
            }
            //  visited[0] = 1;
            recur(matrix, 0, n);
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (visited[i] == 0) {
                    found = true;
                }

            }
            if (found == true)
                System.out.println("0");
             else
                System.out.println("1");
        }
    }
}