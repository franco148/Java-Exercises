package com.fral.extreme.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Given: int[] array = {1, 2, 2, 1, 1, 3, 5, 1, 2};
 *
 * DO: Count repeated elements in the array
 */
public class Exercise4 {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 1, 1, 3, 5, 1, 2};

        // Crear un mapa para almacenar las repeticiones
        Map<Integer, Integer> repeticiones = new HashMap<>();

        // Contar las repeticiones de cada elemento en el array
        for (int num : array) {
            repeticiones.put(num, repeticiones.getOrDefault(num, 0) + 1);
        }

        // Imprimir el mapa con las repeticiones de cada elemento
        System.out.println(repeticiones);
    }
}
