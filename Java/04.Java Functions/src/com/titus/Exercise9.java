package com.titus;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = input.nextInt();

        int result = factorial(n);
        System.out.println("Result = " + result);
    }

    private static int factorial(int n) {
        int result = 1;
        if (n <= 1) return result;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
