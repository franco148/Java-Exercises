package org.avantica.course.pyramid;

import java.util.Scanner;

public class PyramidApplication {

    //region Constants
    private static final int MULTIPLICATION_CONSTANT = 2;
    private static final int SUBTRACTION_CONSTANT = 1;
    private static final int DEFAULT_NUMBER_OF_SPACES = 0;
    private static final char EMPTY_CHARACTER = ' ';
    private static final char NEW_LINE_CHARACTER = '\n';

    private static final String ERROR_INVALID_TYPE_MESSAGE = "The type of value your entered is not correct, please try again (Enter a integer number): ";
    private static final String ERROR_INVALID_RANGE_MESSAGE = "The value you entered does not meet the permitted range. Please try again: ";
    private static final String EXIT_PROGRAM_MESSAGE = "BYE BYE...";
    //endregion

    //region Variables
    private static char PYRAMID_SYMBOL = '*';
    //endregion


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMainMenu();

        int enteredNumber = 0;

        do {
            try {
                enteredNumber = scanner.nextInt();
            } catch (Exception ex) {
                System.out.print(ERROR_INVALID_TYPE_MESSAGE);
                scanner = new Scanner(System.in);
                enteredNumber = 1;
                continue;
            }

            if (!isValidAmount(enteredNumber)) {
                System.out.print(ERROR_INVALID_RANGE_MESSAGE);
                scanner = new Scanner(System.in);
                enteredNumber = 1;
                continue;
            }

            if (exit(enteredNumber)) {
                System.out.println(EXIT_PROGRAM_MESSAGE);
                continue;
            }

            String pyramidSequenceResult = buildPyramid(enteredNumber, DEFAULT_NUMBER_OF_SPACES);
            System.out.println(pyramidSequenceResult);
            System.out.print("Please enter an integer number: ");
        } while (isValidAmount(enteredNumber) && !exit(enteredNumber));
    }

    /**
     * Recursive method that builds a pyramid based on the parameters.
     * @param numberOfLevels specifies the number of levels is going to have the pyramid.
     * @param whiteSpacesAmount whitespaces that needs to be printed for having a nice looking pyramid.
     * @return The pyramid built.
     */
    private static String buildPyramid(int numberOfLevels, int whiteSpacesAmount) {

        if (numberOfLevels < 1) {
            return "Invalid amount for drawing the pyramid.";
        }

        if (numberOfLevels == 1) {
            // Before print the character it needs to build whitespace sequence.
            String whitespaces = buildCharacters(EMPTY_CHARACTER, whiteSpacesAmount);
            return whitespaces + PYRAMID_SYMBOL;
        }

        // Adding whitespaces to the sequence.
        StringBuilder rowSequenceResult = new StringBuilder(buildCharacters(EMPTY_CHARACTER, whiteSpacesAmount));

        // Calculation based on the analyzed formula: n * 2 -1
        int numberOfPyramidCharacters = numberOfLevels * MULTIPLICATION_CONSTANT - SUBTRACTION_CONSTANT;
        rowSequenceResult.append(buildCharacters(PYRAMID_SYMBOL, numberOfPyramidCharacters));

        rowSequenceResult.insert(0,                                             // Index that specifies the position in which is going to be inserted the generated sequence.
                            buildPyramid(numberOfLevels - 1,        // buildPyramid is being called recursively
                                          whiteSpacesAmount + 1) +
                                NEW_LINE_CHARACTER);                                   // Concatenating a NEW LINE character \\n

        return rowSequenceResult.toString();
    }

    /**
     * Build sequence of characters based on the specified in @param symbol, and the @param amount
     * @param symbol The character that is going to contain the sequence.
     * @param amount The number of times that the character is going to be append to the sequence.
     * @return The sequence built based on the parameters.
     */
    private static String buildCharacters(char symbol, int amount) {
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < amount; index++) {
            builder.append(symbol);
        }

        return builder.toString();
    }

    /**
     * This method verifies that the value entered by user is in a valid range.
     * @param numberOfLevels means how many rows is going to contain the pyramid.
     * @return TRUE if it is in the range.
     */
    private static boolean isValidAmount(int numberOfLevels) {
        return numberOfLevels >= 0 && numberOfLevels <= 10;
    }

    /**
     * Verifies if the entered value if for exiting the program.
     * @param enteredValue value read from keyboard.
     * @return TRUE if entered option is for exiting the program.
     */
    private static boolean exit(int enteredValue) {
        return enteredValue == 0;
    }

    private static void printMainMenu() {
        System.out.println("=======================================================================================");
        System.out.println("==========                           PYRAMID DRAWER                          ==========");
        System.out.println("=======================================================================================");
        System.out.println("- The value you enter needs to be in the range of: [n > 0 and n <= 10]");
        System.out.println("- Enter zero [0] to finish the program.");
        System.out.println("=======================================================================================");
        System.out.print("Please enter an integer number: ");
    }
}
