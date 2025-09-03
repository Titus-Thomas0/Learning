package com.Titus;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        findArmstrong(num1, num2);
    }

    static void findArmstrong(int low, int high) {
        for (int i = low + 1; i < high; ++i) {
            // Find number of digits in a number
            int x = i;
            int n = 0;
            while (x != 0) {
                x /= 10;
                n++;
            }
            // Find the sum of all the digits to power of the total no on digits
            x = i;
            int pow_sum = 0;
            while (x != 0) {
                int digit = x % 10;
                pow_sum += (int) Math.pow(digit, n);
                x /= 10;
            }
            // Check if its armstrong or not and print the number
            if (i == pow_sum) {
                System.out.print(i + " ");
            }
        }
    }
}
