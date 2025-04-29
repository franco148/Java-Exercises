package com.fral.extreme.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Count stable segments:
 * Example:
 *
 * GIVEN: [9, 3, 3, 3, 9]
 * OUTPUT: 2 because stable subsegments are: [3, 3, 3] and [9, 3, 3, 3, 9]
 *
 *
 * GIVEN: [9, 3, 1, 2, 3, 9, 10]
 * OUTPUT: 2 because stable subsegments are: [9, 3, 1, 2, 3, 9] and [3, 1, 2, 3]
 *
 *
 * GIVEN: [6, 1, 2, 3, 6]
 * OUTPUT: 1 because the entire array is a stable segment.
 */
public class Exercise9 {

    private static int countStableSegments(List<Integer> capacityList) {
        if (capacityList.size() <= 2) {
            return 0;
        }

        Map<Integer, Map<Integer, Integer>> occurrencesCounter = new HashMap<>();
        Integer prefixSum = capacityList.get(0);
        int result = 0;

        // Initializing the map with the first element.
        occurrencesCounter.computeIfAbsent(capacityList.get(0), k -> new HashMap<>())
                          .put(prefixSum, 1);

        for (int i = 1; i < capacityList.size(); i++) {
            int xNum = capacityList.get(i);

            // If there is previous segments with the same value and prefixSum
            if (occurrencesCounter.containsKey(xNum)) {
                Integer targetSum = prefixSum - xNum;
                result += occurrencesCounter.get(xNum).getOrDefault(targetSum, 0);
            }

            prefixSum += xNum;

            // Update the map with the new  prefixSum to the actual value
            occurrencesCounter.computeIfAbsent(xNum, k -> new HashMap<>())
                    .put(prefixSum, occurrencesCounter.get(xNum).getOrDefault(prefixSum, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(9, 3, 3, 3, 9);
        List<Integer> list2 = Arrays.asList(9, 3, 1, 2, 3, 9, 10);
        List<Integer> list3 = Arrays.asList(6, 1, 2, 3, 6);

        System.out.println("Expected: 2 - Current: " + countStableSegments(list1));
        System.out.println("Expected: 2 - Current: " + countStableSegments(list2));
        System.out.println("Expected: 1 - Current: " + countStableSegments(list3));
    }
}
