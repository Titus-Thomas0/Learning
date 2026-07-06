package com.Titus.Advance;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number ");
        int number = input.nextInt();
        // Find the digits in that number
        int x = number;
        int count = 0;
        while (x != 0) {
            x /= 10;
            count++;
        }
        // Find the sum to the power of its digit of the number
        x = number;
        int pow_sum = 0;
        while (x != 0) {
            int digit = x % 10;
            pow_sum += (int) Math.pow(digit, count);
            x /= 10;
        }
        // Print the result
        if(pow_sum == number) {
            System.out.println("Its an armstrong number.");
        }
        else {
            System.out.println("Its not an armstrong number");
        }
    }
}
