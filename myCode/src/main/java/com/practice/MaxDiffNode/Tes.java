package com.practice.MaxDiffNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Tes
{


    public static void main( String args[] )
    {
        List<Integer> numberList = Arrays.asList( 1, 2, 3, 4, 5 );

        List<Person> personList = new ArrayList<>();
        Person p1 = new Person( 1, "Dhiraj" );
        Person p3 = new Person( 1, "Shukla" );
        Person p2 = new Person( 2, "Ravi" );
        personList.add( p1 );
        personList.add( p2 );
        personList.add( p3 );
        // personList.stream()


    }

}


class Person
{
    int age;
    String name;
    String city;


    public Person( int age, String name )
    {
        this.age = age;
        this.name = name;
    }


    public int getAge()
    {
        return age;
    }


    public void setAge( int age )
    {
        this.age = age;
    }


    public String getName()
    {
        return name;
    }


    public void setName( String name )
    {
        this.name = name;
    }


    public String getCity()
    {
        return city;
    }


    public void setCity( String city )
    {
        this.city = city;
    }


    @Override public String toString()
    {
        return "Person{" + "age=" + age + ", name='" + name + '\'' + '}';
    }
}