package org.avantica.course.class001;

public class VariableScopes {

    // Global Variables can be used in all the class.
    static int myNewInt = 5;

    public static void main(String[] args) {

        // Local variables can be used only in the scope where they are declared.
        int myLocalInt = 10;

        {
            int myOtherInt = 20;
            System.out.println("myOtherInt= " + myOtherInt);
            System.out.println("myLocalInt= " + myLocalInt);
        }

        // System.out.println("myOtherInt= " + myOtherInt); //compilation error.
    }

    public static void myMethod() {
        myNewInt = 9;
        // myLocalInt = 0; //compilation error.
    }
}
