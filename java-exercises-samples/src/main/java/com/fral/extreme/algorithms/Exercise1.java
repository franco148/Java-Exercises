package com.fral.extreme.algorithms;

import java.util.*;

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
}
