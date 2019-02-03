//package com.practice.utils;
//
//
//import java.util.Comparator;
//import java.util.PriorityQueue;
//
//
//public class MergeKArrayList
//{
//
//    public static void main( String a[] )
//    {
//
//        Node nodeArrayList[] = new Node[3];
//        nodeArrayList[0]=new Node(1);
//        nodeArrayList[0].next= new Node(4);
//        nodeArrayList[0].next.next= new Node(7);
//        nodeArrayList[1]=new Node( 2 );
//        nodeArrayList[1].next= new Node( 5 );
//        nodeArrayList[1].next.next= new Node( 7 );
//        nodeArrayList[2]=new Node(7);
//        nodeArrayList[2].next=new Node(8);
//       Node result =  mergeKArrayList(nodeArrayList,3);
//        while ( result!=null ){
//            System.out.println(result.data+" ");
//            result=result.next;
//        }
//    }
//
//
//   static Node mergeKArrayList( Node[] ArrayLists, int N )
//    {
//        Node resulthead = null;
//
//        Node currentNode = null;
//
//        PriorityQueue<Node> queue = new PriorityQueue<>( Comparator.comparing((n)->n.data ) );
//        for ( Node header : ArrayLists ) {
//            queue.add( header );
//        }
//
//        while ( queue.size() != 0 ) {
//            Node node = queue.peek();
//            queue.remove( node );
//            if ( resulthead == null ) {
//                resulthead = node;
//                currentNode = node;
//                if ( node.next != null )
//                    queue.add( node.next );
//            } else {
//                currentNode.next = node;
//                if(node.next!=null){
//                    queue.add( node.next );
//                }
//                currentNode=currentNode.next;
//
//            }
//
//        }
//
//   return resulthead;
//    }
//}
