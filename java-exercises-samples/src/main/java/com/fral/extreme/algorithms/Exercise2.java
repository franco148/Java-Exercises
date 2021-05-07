package com.fral.extreme.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */
public class Exercise2 {

    public static void main(String[] args) {
        // Count the each work in the given string
        String input = "string this is a test string that contains many string a string strings";

        // Running approach 1
        approach1(input);
    }

    private static void approach1(String input) {
        List<String> inputList = Arrays.asList(input.split(" "));

        Map<String, Integer> result = new HashMap<>();
        for (String str : inputList) {

            if (result.containsKey(str)) {
                int newAmount = result.get(str) + 1;
                result.put(str, newAmount);
            } else {
                result.put(str, 1);
            }

        }

        result.forEach((key, value) -> System.out.println(String.format("Word [%s] - repeated [%s] times.", key, value)));
    }

    private static void approach2(String input) {}
}
