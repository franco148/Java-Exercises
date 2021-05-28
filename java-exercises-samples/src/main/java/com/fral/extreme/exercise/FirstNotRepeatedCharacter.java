package com.fral.extreme.exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstNotRepeatedCharacter {


    public static void main(String[] args) {
        String input1 = "This is an example for verifying the first repeated character";
        String input2 = "This is an example - an example is this";
        String input3 = "This is an example for verifying the first repeated character - what position is it?";

        showFirstRepeatedInfo(Arrays.asList(input1.split(" ")));
        showFirstRepeatedInfo(Arrays.asList(input2.split(" ")));
        showFirstRepeatedInfo(Arrays.asList(input3.split(" ")));
    }

    private static void showFirstRepeatedInfo(List<String> inputList) {
        System.out.println("Analyzing input: " + inputList + "\n");

        String character = "<EMPTY>";
        int position = -1;
        Set<String> repeatedVerifier = new HashSet<>();

        for (String input : inputList) {
            if (!repeatedVerifier.add(input)) {
                character = input;
                position = repeatedVerifier.size();

                break;
            }
        }

        System.out.println(String.format("The repeated character is: [%s] in position: [%d] \n", character, position));
        System.out.println("-------------------------------------------");
    }
}
