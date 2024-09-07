package com.corejava18.functional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequecyWord {
    /**
     * 14) Write a program that takes a list of words, counts the frequency of each word, and prints the word along with its count in descending order of frequency use java 8 only.
     */

    public static void main(String[] args){
        System.out.println("Print frequecy of word");
        List<String> words = Arrays.asList("apple", "banana", "orange",
                "apple", "kiwi", "banana", "kiwi", "kiwi");
        words.parallelStream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
                entrySet().stream().filter(element ->element.getValue()>1).collect(Collectors.toList()).forEach(System.out::println);

    }
}
