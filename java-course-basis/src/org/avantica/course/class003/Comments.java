package org.avantica.course.class003;

/**
 * Comments
 * ============================================
 * - Single line comments
 * - Multiline comments
 * - JavaDoc Comments
 */
public class Comments {

    /**
     * This is main method.
     * @param arguments command line arguments
     */
    public static void main(String[] arguments) {

        // Printing size of arguments - Single line comment
        // Shortcut: CTRL + /
        System.out.println("arguments-size " + arguments.length);

        /*
        * Example of multiline comment.
        * Printing arguments passed as a parameter
        */
        for (int i = 0; i < arguments.length; i++) {
            System.out.println("args[" + (i + 1) + "]=" + arguments[i]);
        }
    }

    /**
     * Calculates sum of two integers.
     *
     * @param firstNumber operand
     * @param secondNumber operand
     * @return sum
     */
    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
