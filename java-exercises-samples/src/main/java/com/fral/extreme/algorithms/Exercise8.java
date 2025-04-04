package com.fral.extreme.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Given a non-empty string of lowercase letters and non-negative integer representing a key, write a function that
 * returns a new string obtained by shifting every letter in the input string by k positions in the alphabet,
 * where k is the key.
 *
 * Note that letters should "wrap" around the alphabet; in others words, the letter z shifted by one returns the
 * letter a.
 */
public class Exercise8 {

    /**
     * "xyz" , 2 => zab
     * "xyz" , 3 => abc
     * "xyz" , 4 => bcd
     * "xyz" , 5 => cde
     *
     * @param args
     */
    public static void main(String[] args) {

        // Scenario 1
        String str1 = "xyz";
        int k1 = 2;

        // Scenario 1
        String str2 = "xyz";
        int k2 = 3;

        // Scenario 1
        String str3 = "xyz";
        int k3 = 4;

        // Scenario 1
        String str4 = "xyz";
        int k4 = 5;

        // Scenario 1
        String str5 = "xyz";
        int k5 = 6;

        shiftTheWords(str1, k1);
        shiftTheWords(str2, k2);
        shiftTheWords(str3, k3);
        shiftTheWords(str4, k4);
        shiftTheWords(str5, k5);

    }

    private static void shiftTheWords(String str, int constant) {

        List<Character> allAlphabetWords = new ArrayList<>(getAllOrderedAlphabetWords());

        StringBuilder builder = new StringBuilder();
        char[] stringsArray = str.toCharArray();
        for (char letter : stringsArray) {
            int currentPosition = getActualPositionOfTheCharacter(letter);
            int nextPosition = getNextPositionOfTheCharacter(currentPosition, constant);

            builder.append(allAlphabetWords.get(nextPosition));
        }

        System.out.println(String.format("[%s, %d] => %s", str, constant, builder.toString()));
    }

    private static Set<Character> getAllOrderedAlphabetWords() {
        return Stream.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                         'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                         'u', 'v', 'w', 'x', 'y', 'z').collect(Collectors.toSet());
    }

    private static int getActualPositionOfTheCharacter(char character) {
        Set<Character> allAlphabetWords = getAllOrderedAlphabetWords();

        int index = 0;
        for (char letter : allAlphabetWords) {
            if (letter == character) {
                break;
            }
            index++;
        }

        return index;
    }

    private static int getNextPositionOfTheCharacter(int currentPosition, int constant) {
        int alphabetSize = getAllOrderedAlphabetWords().size();
        int position = currentPosition + constant;
        if (position < alphabetSize) {
            return position;
        }

        return Math.abs(currentPosition + constant - getAllOrderedAlphabetWords().size());
    }
}
