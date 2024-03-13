package com.fral.extreme.exercise;

public class StringOutputExercise {

    public static void main(String[] args) {
        doMethod(null);
    }

    private static void doMethod(String str) {
        System.out.println("This is string");
    }

    private static void doMethod(Object obj) {
        System.out.println("This is object");
    }
}


