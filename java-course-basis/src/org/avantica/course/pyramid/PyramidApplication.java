package org.avantica.course.pyramid;

import java.util.Scanner;

public class PyramidApplication {

    private static final int MULTIPLICATION_CONSTANT = 2;
    private static final int SUBTRACTION_CONSTANT = 1;
    private static final int DEFAULT_NUMBER_OF_SPACES = 0;
    private static final char EMPTY_CHARACTER = ' ';
    private static final char NEW_LINE_CHARACTER = '\n';

    private static char PYRAMID_SYMBOL = '*';


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enteredNumber = 0;
        int number = Integer.parseInt("hola");

        do {
            enteredNumber = scanner.nextInt();
//            PYRAMID_SYMBOL = scanner.next
            String pyr = drawRow(enteredNumber, DEFAULT_NUMBER_OF_SPACES);
            System.out.println(pyr);
        } while (enteredNumber > 0 && enteredNumber < 10);
    }

    private static String drawRow(int numberOfRows, int spaces) {

        if (numberOfRows == 1) {
            String spacesRow = buildCharacters(EMPTY_CHARACTER, spaces);
            return spacesRow + "*";
        }

        StringBuilder rowResult = new StringBuilder(buildCharacters(EMPTY_CHARACTER, spaces));

        int numberOfStars = MULTIPLICATION_CONSTANT * numberOfRows - SUBTRACTION_CONSTANT;
        rowResult.append(buildCharacters(PYRAMID_SYMBOL, numberOfStars));

        rowResult.insert(0, drawRow(numberOfRows - 1, spaces + 1) + NEW_LINE_CHARACTER);

        return rowResult.toString();
    }

    private static String buildCharacters(char symbol, int amount) {
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < amount; index++) {
            builder.append(symbol);
        }

        return builder.toString();
    }
}
