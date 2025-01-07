package com.fral.extreme.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Dada una lista de enteros sin ningún orden en particular, y un entero SUM, escribir un método que reciba
 * estos 2 parámetros y retorne TRUE en caso de que exista dentro de la list un par de números a y b tal
 * que a+b = SUM.
 *
 *
 *
 * Ej:
 * Lista = [0,5,1,-2,8,9 ]
 * SUM = 10
 * Resultado TRUE.
 *
 * Lista = [0,5,-2,8,9 ]
 * SUM = 10
 * Resultado FALSE.
 */
public class Exercise7 {


    public static void main(String[] args) {
        List<Integer> listOne = new ArrayList<>();
        listOne.add(0);
        listOne.add(5);
        listOne.add(1);
        listOne.add(-2);
        listOne.add(8);
        listOne.add(9);

        List<Integer> listTwo = new ArrayList<>();
        listTwo.add(0);
        listTwo.add(5);
        listTwo.add(-2);
        listTwo.add(8);
        listTwo.add(9);

        int sum = 10;

//        System.out.println("ListOne matches the requirement: " + approach1(listOne, sum));
//        System.out.println("ListTwo matches the requirement: " + approach1(listTwo, sum));

        System.out.println("ListOne matches the requirement: " + approach2(listOne, sum));
        System.out.println("ListTwo matches the requirement: " + approach2(listTwo, sum));
    }



    // List=[0, 5, 1, -2, 8, 9], Sum=10
    // Complexity: O(n2) quadratic
    private static boolean approach1(List<Integer> list, int sum) {

        Iterator<Integer> numIterator = list.iterator();
        while (numIterator.hasNext()) {
            int num = numIterator.next();

            for (int index=1; index < list.size(); index++) {
                int value = list.get(index);
                if ((num + value) == sum) {
                    return true;
                }
            }

            numIterator.remove();
        }

        return false;
    }

    // List=[0, 5, 1, -2, 8, 9], Sum=10
    // Complexity: O(n)
    private static boolean approach2(List<Integer> list, int sum) {

        Map<Integer, Integer> complementMap = new HashMap<>();

        for (int num : list) {
            int complement = sum - num;
            if (complementMap.containsKey(complement)) {
                System.out.println("Found: (" + complement + ", " + num + ")");
                return true;
            }

            complementMap.put(num, 1);
        }

        return false;
    }
}
