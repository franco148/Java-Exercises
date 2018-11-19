package org.avantica.course.class001;

/**
 * JAVA PRIMITIVE TYPES
 * ==================================================
 *
 */
public class JavaPrimitiveTypes {

    //region Global Variables
    static boolean myBoolean;
    static byte myByte;
    static short myShort;
    static int myInt;
    static long myLong;
    static float myFloat;
    static double myDouble;
    static char myChar;
    //endregion


    public static void main(String[] args) {
        /*
         * INTEGER DATA TYPES.
         * ================================================================================================
         * In the following example we will see, that the following declaration
         * shows an error.
         * The problem is that all the numbers that are whole numbers in Java are interpreted as integers.
         * So we need to concat the letter L, so it represents the long data type.
         */
        // long max = 3465689485;
        long max = 3465689485L;

        // we can use underscores for understanding better the numbers. It should not be used at the beginning.
        long maxUnderscore = 3_465_689_485L;



        /*
         * DECIMAL DATA TYPES
         * ================================================================================================
         * float, double.
         *
         * The following example is going to show a compilation error. So we will need to add F or f at the end.
         */
        // float myFloatNumbe = 25.4;
        float myFloatNumbe = 25.4F;

        /*
         * Taking into account underscores, the following examples will not compile.
         */
        // double before = 10_.25;
        // double after = 10._25;
        // double first = _10.25;
        // double last = 10_.25_;



        /*
         * PRIMITIVE CHAR AND BOOLEAN TYPES
         * ================================================================================================
         */
        char characterOne = 'a';
        // char characterTwo = 'ab';
        char unicodeChar = '\u03A9';

        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;




        /*
         * DECLARING AND INITIALIZING VARIABLES
         * ================================================================================================
         */

        // Local Variables should be initialized.
        int myNumber;
        // System.out.println("myNumber= " + myNumber);

        double myLocalDouble = 7.50;
        float myFloat1, myFloat2, myFloat3;
        float myFloat4 = 3.3f, myFloat5 = 5, myFloat6;

        // double d1, double d2;



        /*
         * DEFAULT INITIALIZATION OF PRIMITIVES
         * ================================================================================================
         */
        System.out.println("myBoolean= " + myBoolean);
        System.out.println("myByte= " + myByte);
        System.out.println("myShort= " + myShort);
        System.out.println("myInt= " + myInt);
        System.out.println("myLong= " + myLong);
        System.out.println("myFloat= " + myFloat);
        System.out.println("myDouble= " + myDouble);
        System.out.println("myChar= " + myChar);
    }
}
