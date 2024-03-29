package com.fral.eextreme.java.strings;

public class JavaStringInterviewQuestions {

    public static void main(String[] args) {
        String str1 = "Hola";
        String str2 = "Hola";
        String str3 = new String("Hola");
        String str4 = new String("Hola").intern();

        System.out.println("Are they equal (str1 == str2)? = " + (str1 == str2)); // true
        System.out.println("Are they equal (str1 == str3)? = " + (str1 == str3)); // false
        System.out.println("Are they equal (str1 == str4)? = " + (str1 == str4)); // true
    }
}
