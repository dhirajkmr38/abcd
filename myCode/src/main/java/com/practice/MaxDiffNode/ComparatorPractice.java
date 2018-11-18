package com.practice.MaxDiffNode;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;


public class ComparatorPractice
{
    static String fun( String ite )
    {
        return "Hello";
    }


    public static void main( String a[] )
    {
        List<Student> studentList = new ArrayList<>();
        studentList.add( new Student( "Dhi", 1, 80001 ) );
        studentList.add( new Student( "Dhi", 2, 80002 ) );
        studentList.add( new Student( "Dhi", 2, 80003 ) );
        studentList.add( new Student( "Dhi", 4, 80004 ) );
        studentList.add( new Student( "Rhi", 1, 80001 ) );
        //   Collections.sort( studentList,new StudentOrder() );
        // TO CHANGE THE NATURAL ORDER WE NEED TO WRITE OUR OWN METHOD LIKE HERE S1 S2
        studentList.sort( Comparator.comparing( Student::getName, String::compareTo )
            .thenComparing( Student::getRollNumber, ( s1, s2 ) -> s2 - s1 )
            .thenComparing( Student::getPincode, Comparator.reverseOrder() ).reversed() );
        System.out.println( studentList );
        SortedMap<Student, String> map = new TreeMap<>(
            Comparator.comparing( Student::getName ).thenComparing( Student::getPincode ) );
        map.put( new Student( "Dhi", 1, 80001 ), "Abx" );
        map.put( new Student( "Ahi", 10, 80002 ), "Abz" );
        map.put( new Student( "zhi", 1, 80000 ), "Abz" );
        System.out.println( map );
        boolean found = studentList.stream().anyMatch( student -> student.getPincode() == 80001 );
        List<String> a1 = Arrays.asList( "abcd", "def", "ghi" );
        List<String> a2 = Arrays.asList( "2abcd", "2ef", "2ghi" );
        List<List<String>> list = new ArrayList<>();
        list.add( a1 );
        list.add( a2 );

        String name = "Dhi";
        AtomicInteger outerIndex = new AtomicInteger();
        list.stream().map( eachList -> {
            System.out.println( "Outer" + outerIndex );
            outerIndex.incrementAndGet();
            AtomicInteger innerIndex = new AtomicInteger();
            eachList.stream().map( eachWord -> {
                System.out.println( "Inner" + innerIndex );
                innerIndex.incrementAndGet();
                return eachWord;
            } ).collect( Collectors.toList() );
            return eachList;
        } ).collect( Collectors.toList() );
        List<Student> stud = new ArrayList<>();

        Student student = stud.stream().max( Comparator.comparing( Student::getPincode ) ).orElse( null );
        System.out.println( student );

    }
}
