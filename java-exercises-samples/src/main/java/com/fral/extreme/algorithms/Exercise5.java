package com.fral.extreme.algorithms;

/**
 * Fibonacci serie generator O(n)
 */
public class Exercise5 {

    public static void main(String[] args) {
        System.out.println("Fibonacci serie is: " + fibonacciLoop(5));
        System.out.println("Fibonacci recursive is: " + fibonacciRecursive(5));
    }

    public static long fibonacciLoop(int n) {
        if (n <= 1) {
            return n;
        }

        long a = 1;
        long b = 1;
        long c = 0;

        System.out.print("Serie de Fibonacci: ");
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }

        return c;
    }

    public static long fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }
}
