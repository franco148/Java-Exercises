package com.fral.extreme.algorithms;

import java.util.Arrays;

/**
 * Write the `int greaterWithSameDigits(int n)` function:
 * Given a number, return another number by swapping some or all its digits, the resulting numbers should meet the following conditions:
 * -It must be greater than the original number
 * -It must be the smallest number that meets the first condition
 *
 * Example:
 * if n = 129 the result should be 192
 * If n = 2493 the result should be 2934
 * Note: if there is no possible answer for a given input, return -1
 */
public class Exercise6 {

    public static void main(String[] args) {
        System.out.println(greaterWithSameDigits(129));    // Output: 192
        System.out.println(greaterWithSameDigits(2493));   // Output: 2934
        System.out.println(greaterWithSameDigits(3957));   // Output: 3975
        System.out.println(greaterWithSameDigits(991));    // Output: -1
        System.out.println(greaterWithSameDigits(211112)); // Output: 211121
        System.out.println(greaterWithSameDigits(412335)); // Output: 412353
        System.out.println(greaterWithSameDigits(412533)); // Output: 413235
    }

    public static int greaterWithSameDigits(int n) {
        char[] digits = String.valueOf(n).toCharArray();


        int digitIndex = getFirstDigitIndexOfDigitThatIsSmallerThanNextDigit(digits);

        // If no such digit is found, it means there's no possible answer
        if (digitIndex == 0) {
            return -1;
        }

        // Find the smallest digit to the right of digits[i-1] that is greater than digits[i-1]
        int x = digits[digitIndex - 1], smallest = digitIndex;
        for (int j = digitIndex + 1; j < digits.length; j++) {
            if (digits[j] > x && digits[j] < digits[smallest]) {
                smallest = j;
            }
        }

        // Swap digits[i-1] with digits[smallest]
        char temp = digits[digitIndex - 1];
        digits[digitIndex - 1] = digits[smallest];
        digits[smallest] = temp;

        // Sort the digits to the right of digits[i-1] in ascending order
        Arrays.sort(digits, digitIndex, digits.length);

        // Convert the modified array back to integer
        int result = Integer.parseInt(new String(digits));

        // Return the result
        return result;
    }


    static int getFirstDigitIndexOfDigitThatIsSmallerThanNextDigit(char[] digits) {

        int digitIndex;

        // Find the first digit from the right that is smaller than its next digit
        for (digitIndex = digits.length - 1; digitIndex > 0; digitIndex--) {
            if (digits[digitIndex - 1] < digits[digitIndex]) {
                break;
            }
        }

        return digitIndex;
    }
}
