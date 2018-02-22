package com.fral.extreme.fibonacci;

/**
 * It is known that a fibonacci serie has the following formula.
 * FN = Fn-1 + Fn-2
 *
 * When a fibonacci for 1 and 2 is 1.
 */
public final class FibonacciSeries {

    /**
     * Calculates the first @param fibonacci serie result.
     * @param number the first number of fibonacci series.
     * @return the last number of the serie.
     */
    public static int fibonacci(int number) {
        if(number == 1 || number == 2) {
            return 1;
        }

        return fibonacci(number-1) + fibonacci(number -2); //tail recursion
    }

    /**
     * Java program to calculate Fibonacci number using loop or Iteration.
     * @return Fibonacci number
     */
    public static int fibonacciSerie(int number) {
        if(number == 1 || number == 2) {
            return 1;
        }

        int fibo1=1, fibo2=1, fibonacci=1;

        for(int i= 3; i<= number; i++) {
            //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }

        return fibonacci; //Fibonacci number
    }
}
