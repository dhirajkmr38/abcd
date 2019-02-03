package com.practice.flatten;

public class ReverseNumber {


    public static void main(String a[]) {


        String name = "abcdfdsdsdsd";
      //  name=name.substring(0,4);




        StringBuffer n = new StringBuffer();
        for (int j = name.length() - 1; j >= 0; --j) {

             n.append(name.charAt(j));
        }
        System.out.println(n);
    }
}
