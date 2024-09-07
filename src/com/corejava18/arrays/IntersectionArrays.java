package com.corejava18.arrays;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class IntersectionArrays {

    public static void main(String[] args){
        System.out.println("Efficiently Finding the Intersection of Two Arrays in Java;Problem Statement\n" +
                "Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays, and you may return the result in any order.");

        int [] num1Array = new int[]{1,2,3,4,3};
        int [] num2Array = new int[]{2,3,4};
        int [] finalResultArray =intersectTwoArrays(num1Array,num2Array);

        String str = new String(Arrays.toString(finalResultArray));

        System.out.println("Final Result is::"+str);

    }

    private static int[] intersectTwoArrays(int [] num1Array ,int [] num2Array ) {


        Map<Integer, Integer> finalMap = new HashMap<>();
        List<Integer> intersect= new ArrayList<>();

        for(int count1:num1Array){
            finalMap.put(count1,finalMap.getOrDefault(count1,0)+1);
        }
       System.out.println(finalMap);

        for (int count2:num2Array){
            if(finalMap.containsKey(count2) && finalMap.get(count2)>0){
                intersect.add(count2);
                finalMap.put(count2,finalMap.get(count2)-1);
            }
        }
        System.out.println(finalMap);
        int[] finalResult=new int[intersect.size()];
        for(int i=0;i<intersect.size(); i++){
            finalResult[i]=intersect.get(i);
        }

        return finalResult;
    }
}
