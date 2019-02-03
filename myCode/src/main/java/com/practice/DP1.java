package com.practice;

import java.util.*;


public class DP1
{


    public static void main(String a[]){
        int input[]={1,2,3};
        ArrayList<Set<Set>> setArrayList= new ArrayList<>(  ) ;
       Set set = new HashSet(  );
       setArrayList.add( set );
       for(int i =0;i<3;i++){
           Set set1 = new HashSet( setArrayList.get( setArrayList.size()-1 ) );

       }

    }
}
