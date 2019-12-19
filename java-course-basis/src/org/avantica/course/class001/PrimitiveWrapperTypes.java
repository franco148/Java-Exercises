package org.avantica.course.class001;

public class PrimitiveWrapperTypes {

    static Object myObject; //It is initialized as null as default.
    static Object myOtherObject = new Object();

    public static void main(String[] args) {

        /*
         * UNDERSTANDING NULLS
         * ===========================================================
         */
        Object myLocalObject = new Object();
        Object myOtherLocalObject;

        String name = "Java";
        String anotherName = null;

        System.out.println("myObject= " + myObject);
        System.out.println("myOtherObject= " + myOtherObject);

        System.out.println("myLocalObject= " + myLocalObject);
        // System.out.println("myOtherLocalObject= " + myOtherLocalObject);

        System.out.println("name= " + name);
        System.out.println("anotherName= " + anotherName);

        myObject.toString(); //This is going to cause NullPointerException



        /*
         * PRIMITIVE WRAPPER TYPES
         * - Boxing
         * - Unboxing
         * - Autoboxing
         * ===========================================================
         */
        int myInt = 10;
        Integer myInteger1 = new Integer(10);   // Boxing: Converting primitive to wrapper.
        Integer myInteger2 = 20;                      // Autoboxing: Compiler automatically converts primitive to wrapper.
        Integer myInteger3 = Integer.valueOf(10);
        Integer myInteger4 = Integer.valueOf("56");
        Integer myInteger5 = null;
        // int myInt2 = null;    //compilation error.

        int myInt3 = myInteger2; // Unboxing: Converting wrapper to primitive.

    }
}
