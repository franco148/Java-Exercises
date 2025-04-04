package com.fral.extreme.algorithms;

import java.util.Arrays;
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

    }

    private Set<Character> getAllOrderedAlphabetWords() {
        return Stream.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                         'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                         'u', 'v', 'w', 'x', 'y', 'z').collect(Collectors.toSet());
    }

    private int getActualPositionOfTheCharacter(char character) {
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

    private int getNextPositionOfTheCharacter(int currentPosition, int constant) {
        return Math.abs(currentPosition + constant - getAllOrderedAlphabetWords().size());
    }
}
