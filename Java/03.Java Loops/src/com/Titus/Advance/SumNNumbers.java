package com.Titus.Advance;

import java.util.Scanner;

public class SumNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n ");
        int n = input.nextInt();
        int sum = n * (n + 1) / 2;
        System.out.println("The sum of " + n + " numbers is " + sum);
    }
}
