package com.corejava18.functional;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    private static boolean isomorphicStrings(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        Map<Character, Character> checkIsomorphicMap = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(checkIsomorphicMap.containsKey(c1)){
                if(checkIsomorphicMap.get(c1)!=c2){
                    return false;
                }

            }else{
                if(checkIsomorphicMap.containsValue(c2)){
                    return false;
                }
                checkIsomorphicMap.put(c1,c2);
            }
        }

        return true;

    }

    public static void main(String[] args){
        String s1 ="paper";
        String s2 ="title";
        System.out.println(isomorphicStrings(s1,s2));

    }
}
