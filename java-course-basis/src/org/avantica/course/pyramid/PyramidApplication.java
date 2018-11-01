package org.avantica.course.pyramid;

import java.util.Scanner;

public class PyramidApplication {

    //region Menu Constants
    private static final String MENU_BAR = "";
    //endregion
    private static final int MULTIPLICATION_CONSTANT = 2;
    private static final int SUBTRACTION_CONSTANT = 1;
    private static final int DEFAULT_NUMBER_OF_SPACES = 0;
    private static final char EMPTY_CHARACTER = ' ';
    private static final char NEW_LINE_CHARACTER = '\n';

    private static char PYRAMID_SYMBOL = '*';


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMainMenu();

        int enteredNumber;

        do {
            try {
                enteredNumber = scanner.nextInt();
            } catch (Exception ex) {
                System.out.print("The value you entered is incorrect, lease tray again. Enter an integer number: ");
                scanner = new Scanner(System.in);
                enteredNumber = 1;
                continue;
            }

            if (!isValidAmount(enteredNumber)) {
                enteredNumber = 1;
                System.out.println("Invalid amount for drawing the pyramid.");
                scanner = new Scanner(System.in);
                continue;
            }
//            PYRAMID_SYMBOL = scanner.next
            String pyr = drawRow(enteredNumber, DEFAULT_NUMBER_OF_SPACES);
            System.out.println(pyr);
            System.out.print("Please enter an integer number: ");
        } while (isValidAmount(enteredNumber));
    }

    private static String drawRow(int numberOfRows, int spaces) {

        if (numberOfRows < 1) {
            return "Invalid amount for drawing the pyramid.";
        }

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

    /**
     * This method verifies
     * @param numberOfLevels
     * @return
     */
    private static boolean isValidAmount(int numberOfLevels) {
        return numberOfLevels >= 0 && numberOfLevels < 10;
    }

    private static void printMainMenu() {
        System.out.println("=======================================================================================");
        System.out.println("==========                           PYRAMID DRAWER                          ==========");
        System.out.println("=======================================================================================");
        System.out.println("The value you enter needs to be in the range of: [n > 0 and n < 10]");
        System.out.println("=======================================================================================");
        System.out.print("Please enter an integer number: ");
    }
}
