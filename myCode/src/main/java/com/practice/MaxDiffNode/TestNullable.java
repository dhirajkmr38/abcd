//package com.practice.MaxDiffNode;
//
//import com.sun.istack.internal.NotNull;
//import com.sun.istack.internal.Nullable;
//
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.Future;
//
//
//public class TestNullable
//{
//    static ExecutorService executorService = Executors.newFixedThreadPool( 2 );
//   static String name[]={"dhiraj","niraj"};
//
//
//    public static void main( String a[] ) throws InterruptedException, ExecutionException
//    {
//
//        for(int i =0;i<2;i++) {
//            Future<Boolean> t1 = executorService.submit( () -> {
//                System.out.println( Thread.currentThread().getName() );
//                for ( String x : name ) {
//                    System.out.println( x );
//                }
//                Thread.currentThread().sleep( 10000 );
//                return true;
//            } );
//
//
//            Future<Boolean> t2 = executorService.submit( () -> {
//                System.out.println( Thread.currentThread().getName() );
//                try {
//                    for ( String x : name ) {
//                        System.out.println( x );
//                    }
//                    Thread.currentThread().sleep( 1221 );
//
//                } catch ( InterruptedException e ) {
//                    e.printStackTrace();
//                }
//                return true;
//            } );
//            boolean first = t1.get();
//            boolean second = t2.get();
//            if ( t1.isDone() && t2.isDone() ) {
//                System.out.println( "Ok completed" );
//            }
//        }
//        System.out.println("Main thread exit ");
//   executorService.shutdownNow();
//    }
//
//
//}
//
