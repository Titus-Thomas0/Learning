package com.Titus.Advance;

import java.util.Scanner;

public class SumCategory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers and zero to stop ");
        int negativeSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;
        while (true) {
            int num = input.nextInt();
            if (num < 0) {
                negativeSum += num;
            }
            else if (num > 0 && num % 2 == 0) {
                positiveEvenSum += num;
            }
            else if (num > 0 && num % 2 != 0) {
                positiveOddSum += num;
            }
            else if (num == 0) {
                break;
            }
        }
        System.out.println("The sum of all the negative numbers is " + negativeSum);
        System.out.println("The sum of all the positive even numbers is " + positiveEvenSum);
        System.out.println("The sum of all the positive odd numbers is " + positiveOddSum);
    }
}
