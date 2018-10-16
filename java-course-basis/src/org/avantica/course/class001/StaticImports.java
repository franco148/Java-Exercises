package org.avantica.course.class001;

import static org.avantica.course.utilities.Config.*;

/**
 * STATIC IMPORTS
 * ==========================================================
 * - How to use static imports
 * - Importing custom static members
 */
public class StaticImports {

    public static void main(String[] args) {
        int min = Math.min(5, 7);
        System.out.println("min= " + min);
        System.out.println(Math.PI);

        printConfig();
        System.out.println("name= " + NAME);
    }
}
