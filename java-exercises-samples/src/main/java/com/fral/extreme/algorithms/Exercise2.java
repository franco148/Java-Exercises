package com.fral.extreme.algorithms;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */
public class Exercise2 {

    private static final String SPACE = " ";

    public static void main(String[] args) {
        // Count the each work in the given string
        String input = "string this is a test string that contains many string a string strings";

        // Running approach 1
        // approach1(input);

        // Running approach 2
        // approach2(input);

        // Running approach 2
        // approach3(input);

        // Running approach 2
        approach4Sorted(input);
    }

    private static void approach1(String input) {
        String[] inputList = input.split(SPACE);

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

    private static void approach2(String input) {
        Map<String, Long> collect = Arrays.stream(input.split(SPACE))
                .collect(groupingBy(Function.identity(), counting()));

        collect.forEach((key, value) -> System.out.println(String.format("Word [%s] - repeated [%s] times.", key, value)));
    }

    private static void approach3(String input) {
        Map<String, Integer> collect = Arrays.stream(input.split(SPACE))
                .collect(groupingBy(Function.identity(), summingInt(e -> 1)));

        collect.forEach((key, value) -> System.out.println(String.format("Word [%s] - repeated [%s] times.", key, value)));
    }

    private static void approach4Sorted(String input) {
        Map<String, Long> collect = Arrays.stream(input.split(SPACE))
                .collect(groupingBy(Function.identity(), counting()));

        Map<String, Long> countByWordSorted = collect.entrySet()
                .stream()
                //.sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(
                    Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> {
                            throw new IllegalStateException();
                        },
                        LinkedHashMap::new
                    )
                );

        countByWordSorted.forEach((key, value) -> System.out.println(String.format("Word [%s] - repeated [%s] times.", key, value)));
    }
}
