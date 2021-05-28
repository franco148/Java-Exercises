package com.fral.extreme.exercise;

import java.util.*;

public class FirstRepeatedCharacter {


    public static void main(String[] args) {
        String input1 = "This is an example for verifying the first repeated character";
        String input2 = "This is an example - an example is this";
        String input3 = "This is an example for verifying the first repeated character - what position is it?";

        showFirstRepeatedInfoApproach2(Arrays.asList(input1.split(" ")));
        showFirstRepeatedInfoApproach2(Arrays.asList(input2.split(" ")));
        showFirstRepeatedInfoApproach2(Arrays.asList(input3.split(" ")));
    }

    private static void showFirstRepeatedInfoApproach1(List<String> inputList) {
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

    private static void showFirstRepeatedInfoApproach2(List<String> inputList) {
        System.out.println("Analyzing input: " + inputList + "\n");

        String character = "<EMPTY>";
        int position = -1;
        Map<String, Integer> repeatedVerifier = new HashMap<>();

        for (int index = 0; index < inputList.size(); index++) {

            String inputChar = inputList.get(index);
            if (repeatedVerifier.containsKey(inputChar)) {
                character = inputChar;
                position = index;
                repeatedVerifier.replace(inputChar, index);

                break;
            } else {
                repeatedVerifier.put(inputChar, null);
            }
        }

        System.out.println(String.format("The repeated character is: [%s] in position: [%d] \n", character, position));
        System.out.println("-------------------------------------------");
    }
}
