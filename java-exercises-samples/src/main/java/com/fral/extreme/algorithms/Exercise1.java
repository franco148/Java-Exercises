package com.fral.extreme.algorithms;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Given:
 * Input: "eat, tek, sec, sce, ate, kyo, tea, koy, yok, yko"
 * Output:
 * {
 *     [eat, ate, tea],
 *     [tek],
 *     [sec, sce],
 *     [kyo, koy, yok, yko]
 * }
 */
public class Exercise1 {

    public static void main(String[] args) {
        List<String> myInputList = Arrays.asList("eat", "tek", "sec", "sce", "ate", "kyo", "tea", "koy", "yok", "yko");
        Map<String, List<String>> outputResult = outputBuilder(myInputList);
        outputResult.forEach((key, value) -> {
            System.out.println(value);
        });
    }

    private static Map<String, List<String>> outputBuilder(List<String> inputList) {
        Map<String, List<String>> outputResult = new HashMap<>();

        for (String key : inputList) {
            String mapKey = getSortedString(key);
            if (outputResult.containsKey(mapKey)) {
                outputResult.get(mapKey).add(key);
            } else {
                List<String> keyValues = new ArrayList<>();
                keyValues.add(key);
                outputResult.put(mapKey, keyValues);
            }
        }

        return outputResult;
    }

    private static String getSortedString(String source) {
        return source.chars()
                     .sorted()
                     .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                     .toString();
    }

    // APPROACH 2: SORT
//    private static String getSortedString(String source) {
//        // Converting input string to character array
//        char tempArray[] = source.toCharArray();
//
//        // Sorting temp array using
//        Arrays.sort(tempArray);
//
//        // Returning new sorted string
//        return new String(tempArray);
//    }


    // APPROACH 3: SORT
//    private static String getSortedString(String source) {
//        return Stream.of(source.split(""))
//                .sorted()
//                .collect(Collectors.joining());
//    }


    // SORT REVERSE
//    private static String getReverseSortedString(String source) {
//        StringBuilder builder = new StringBuilder(source);
//        builder.reverse();
//
//        return builder.toString();
//    }

    // APPROACH 2: SORT REVERSE
//    private static String getReverseSortedString(String source) {
//        Character[] tempArray = (Character[]) source.toCharArray();
//        Arrays.sort(tempArray, Comparator.reverseOrder());
//    }
}
