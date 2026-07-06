package com.titus;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();

        System.out.print("Sum of natural numbers are " + findSum(num));
    }

    private static int findSum(int num) {
        if (num == 1) return 1;
        return num + findSum(num - 1);
    }
}
