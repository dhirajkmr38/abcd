//package com.practice.utils;
//
//import java.util.Map;
//import java.util.PriorityQueue;
//import java.util.TreeMap;
//
//
//public class KArrayListMerge
//{
//
//    public static void main(String args[]){
//        int inp[][]={{11,5,6,7,10},{2,3,11,14},{2,8,10}};
//        Map<Integer,Integer> mapper = new TreeMap<>(  );
//        mapper.put(new Integer( inp[0][0]),0);
//        mapper.put(new Integer(  inp[1][0]),0);
//        mapper.put(new Integer(  inp[2][0]),0);
//        System.out.println(mapper);
//
//        Integer a = new Integer( 12 );
//        Integer b = new Integer( 12 );
//        PriorityQueue<Integer> x = new PriorityQueue<>(  );
//        x.add( 11 );
//        x.add( 13 );
//        x.add( 2 );
//        while(x.size()!=0) {
//
//            System.out.println( x.peek() );
//        x.remove( x.peek() );
//        }
//        System.out.println(x);
//        System.out.println(a.equals( b ));
//        if(a==b){
//            System.out.println("k");
//        }
//        else{
//            System.out.println("Not ok");
//        }
//    }
//}
