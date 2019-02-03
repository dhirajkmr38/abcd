package com.practice.LinkedList;

public class MergeTwoList
{
    static Node decideHead( Node head1, Node head2 )
    {
        if ( head1.data > head2.data )
            return head2;
        else {
            return head1;
        }
    }

    static Node movePointerAhead(Node head1,Node head2){
        while( head1!=null && head1.next!=null &&   head1.next.data<head2.data){
            head1= head1.next;
        }

        System.out.println("Head "+head1.data);
        return head1;
    }
    static Node mergeList(Node firstHead,Node secondHead){
        Node nextOfFirstNode = firstHead.next;
        firstHead.next = secondHead;
        return nextOfFirstNode;
    }
    static Node merge( Node header1, Node header2 )
    {

        Node mergedHead = decideHead( header1, header2 );
        while(header1!=null && header2!=null){
            if(header1.data<header2.data){
                 header1 = movePointerAhead(header1,header2);
                  header1= mergeList(header1,header2);
            }
            else{
                header2= movePointerAhead( header2,header1 );
                header2= mergeList( header2,header1 );
            }

        }
        return mergedHead;
    }
    static void printList(Node head){
        while ( head!=null ){
            System.out.print(head.data+" ");
            head= head.next;
        }
    }


    public static void main( String args[] )
    {
        Node header1 = new Node( 1 );
        header1.next = new Node( 12);
        header1.next.next = new Node( 15 );
        Node header2 = new Node(6  );
        header2.next = new Node( 17 );
        header2.next.next = new Node( 18 );


        Node mergedHead = merge( header1, header2 );
        printList(mergedHead);
    }

}
