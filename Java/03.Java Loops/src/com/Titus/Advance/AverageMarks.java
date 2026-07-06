package com.Titus.Advance;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of subjects ");
        int subjectsCount = input.nextInt();
        int sum = 0;
        int average;
        for (int i = 1; i <= subjectsCount; i++) {
            System.out.println("Enter the subject " + i + " mark.");
            int mark = input.nextInt();
            sum += mark;
        }
        average = sum / subjectsCount;
        System.out.println("The average of " + subjectsCount + " subject marks are " + average);
    }
}
