package org.avantica.course.pyramid;

import java.util.Scanner;

public class PyramidPatrik {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number between 1 to 10");
        System.out.println("Enter a number: ");
        int num = reader.nextInt();

        while ((num >0 && num<=10)&&(num!=0))  {

            // while (num<10){
            //     System.out.println("Enter number between 1 to 10");
            // }
            for (int i = 0; i < num; i++) {
                for (int x = num - 2; x >= i; x--) {
                    System.out.print(" ");
                }

                for (int x = 0; x <= 2 * i; x++) {
                    System.out.print("+");
                }
                System.out.println("");

            }
            System.out.println("Enter another number. Zero for Exit: ");
            num = reader.nextInt();



        }

    }

}
