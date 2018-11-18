package com.practice;

interface Person
{
    void hello( int x );

    default void def()
    {

    }

}


public class Tt
{
    Person person;


    public static void main( String args[] )
    {

        Tt tt = new Tt();

        tt.setPerson( ( a ) -> System.out.println( "hello word " + a ) );
        tt.person.hello( 12 );

    }


    public void setPerson( Person person )
    {
        this.person = person;
    }
}
