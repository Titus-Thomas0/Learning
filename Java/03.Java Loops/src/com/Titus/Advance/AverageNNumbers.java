package com.Titus.Advance;

import java.util.Scanner;

public class AverageNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers ");
        int sum = 0;
        int average;
        int count = 0;

        while (true) {
            int num = input.nextInt();
            if (num != 0) {
                sum += num;
                count++;
            }
            else {
                average = sum / count;
                System.out.println("The average of " + count + " numbers is " + average);
                break;
            }
        }
    }
}