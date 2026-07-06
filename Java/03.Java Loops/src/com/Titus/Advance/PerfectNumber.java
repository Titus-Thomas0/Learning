package com.Titus.Advance;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the n ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (n == sum) {
            System.out.println("Its perfect number");
        }
        else {
            System.out.println("Its not perfect number");
        }
    }
}
