package com.practice.MaxDiffNode;

public class Student
{
    String name;
    int rollNumber;
    int pincode;


    public Student( String name, int rollNumber, int pincode )
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.pincode = pincode;
    }


    public Student()
    {
    }


    public String getName()
    {
        return name;
    }


    public void setName( String name )
    {
        this.name = name;
    }


    public int getRollNumber()
    {
        return rollNumber;
    }


    public void setRollNumber( int rollNumber )
    {
        this.rollNumber = rollNumber;
    }


    public int getPincode()
    {
        return pincode;
    }


    public void setPincode( int pincode )
    {
        this.pincode = pincode;
    }


    @Override public String toString()
    {
        return "Student{" + "name='" + name + '\'' + ", rollNumber=" + rollNumber + ", pincode=" + pincode + '}';
    }
}
