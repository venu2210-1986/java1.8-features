package com.corejava18.functional;

import java.util.Arrays;
import java.util.List;

public class SumOfSquaresOfEvenNumbers {
    /**
     * 13) Solve below problem using java 8 -
     *
     * Write a program that takes a list of integers, filters out the even numbers, squares each remaining number, and then calculates the sum of the squared numbers.
     *
     * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
     */

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int count = numbers.stream().filter(n->n%2==0).map(n->n*n).reduce(0,Integer::sum);
        System.out.println(count);

        String s1=new String("abc");

        String s2=new String("abc");

        String s3="abc";

        String s4="abc";



        System.out.println(s1==s2);//false

        System.out.println(s2==s3); //false

        System.out.println(s1==s3);//false

        System.out.println(s3==s4); //true
    }
}
