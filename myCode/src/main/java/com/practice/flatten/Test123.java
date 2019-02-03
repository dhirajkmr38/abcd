package com.practice.flatten;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Test123
{



 public static void main(String args[]){
  List<Integer>  list = new LinkedList<>(  );
  list.add(12);
  list.add( 14 );
  list.add(16);
  list.add( 117 );
  int indexToInsert=-1;

  for(int i =0;i<list.size()-1;i++){
     int x= list.get( i );
     int y = list.get( i+1 );
     if(y-x>5){
      indexToInsert=i;
      break;
     }
  }
  if(indexToInsert!=-1)
  list.add( indexToInsert+1,99 );
  System.out.println(list);
 }

}
