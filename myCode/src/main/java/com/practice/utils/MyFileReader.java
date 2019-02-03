package com.practice.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class MyFileReader
{


    public static void main(String args[]) throws FileNotFoundException
    {
        FileReader file = new FileReader( "/home/admin/Downloads/InnovFinLive/innfin_jan2019_s3ImagePath.txt" );
        Scanner sc = new Scanner( file );
        while(sc.hasNext()){
            System.out.println(sc.next());
        }

    }
}
