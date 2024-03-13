package com.fral.extreme.exercise;

public class StringPoolExercises {

    public static void main(String[] args) {
//        methodOne();
        methodTwo();
    }

    private static void methodOne() {
        String string1 = "Java";
        StringBuilder builder = new StringBuilder();
        builder.append("Ja");
        builder.append("va");

        // This compares references
        System.out.println("Are equal? " + string1 == builder.toString());

        // This compares content
        System.out.println("Are equal? " + string1 == builder.toString());
    }

    private static void methodTwo() {
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));

        /*
        a) true is printed out exactly once.
        b) true is printed out exactly twice.
        c) true is printed out exactly three times.  - Answer
        d) true is printed out exactly four times.
        e) The code does not compile
         */
    }
}
