package com.practice.LinkedList;

public class YIntersection
{
     int calcaulateLength(Node head){
        int nodeCounter=0;
        while ( head!=null ){
            ++nodeCounter;
            head= head.next;
        }
        return nodeCounter;
    }
    Node movePointerAhead(Node head,int dis){
        while(dis!=0){
            head= head.next;
            --dis;

        }
        return head;
    }
    Node checkMergePoint(Node headA,Node headB){
         while(headA!=null && headB!=null ){
             if(headA==headB){
                 return headA;
             }
             headA= headA.next;
             headB= headB.next;

         }
         return null;
    }
    int intersectPoint(Node headA, Node headB)
    {
        int len1= calcaulateLength(headA);
        int len2 = calcaulateLength( headB );
        if(len1>len2){
            headA = movePointerAhead( headA,len1-len2 );

        }
        else{
            headB = movePointerAhead( headB,len2-len1);
        }
        Node mergePoint =checkMergePoint(headA,headB);
        if(mergePoint==null)
            return -1;
        else{
            return mergePoint.data;
        }
    }


    public static void main(String args[]){

    }
}
