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

        int fibonacci = fibonacci(number-1) + fibonacci(number -2); //tail recursion
        System.out.print(fibonacci + " ");

        return fibonacci;
    }

    /**
     * Java program to calculate Fibonacci number using loop or Iteration.
     * @return Fibonacci number
     */
    public static int fibonacciSerie(int number) {
        if(number <= 1) {
            System.out.println(1 + " ");
            return 1;
        }

        int fibo1=0, fibo2=1, fibonacci=1;
        System.out.print(fibonacci + " ");

        for(int i= 2; i<= number; i++) {
            //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
            System.out.print(fibonacci + " ");
        }

        return fibonacci; //Fibonacci number
    }

    public static void main(String[] args) throws InterruptedException {

        Thread recursiveApproach = new Thread(() -> {
            long startTime = System.nanoTime();
            int fibonnaci = fibonacci(10);
            long endTime = System.nanoTime();

            long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.

            System.out.println("RECURSIVE: Serie is " + fibonnaci + " duration: " + duration);

        });

        Thread iterativeApproach = new Thread(() -> {
            long startTime = System.nanoTime();
            int fibonnaci = fibonacciSerie(10);
            long endTime = System.nanoTime();

            long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.

            System.out.println("ITERATIVE: Serie is " + fibonnaci + " duration: " + duration);
        });

        recursiveApproach.start();
//        iterativeApproach.start();

        recursiveApproach.join();
//        iterativeApproach.join();
    }
}
