package org.avantica.course.class002;

/**
 * MAIN METHOD
 * ========================================
 * - Command line parameters
 * - Pass parameters using IDE (Intellij)
 */
public class MainMethod {

    /**
     * Notes:
     * - Shortcut for generating main method: psvm + enter
     * - Shortcut for generating println method: sout + enter
     */
    public static void main(String[] arguments) {
        System.out.println("arguments-size " + arguments.length);

        for (int i = 0; i < arguments.length; i++) {
            System.out.println("args[" + (i + 1) + "]=" + arguments[i]);
        }
    }
}
