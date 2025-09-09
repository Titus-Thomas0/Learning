package com.Titus.Advance;

import java.util.Scanner;

public class SumAllDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = input.nextInt();
        int x = num;
        int sum = 0;
        while (x != 0) {
            int temp = x % 10;
            sum += temp;
            x /= 10;
        }
        System.out.println("The sum of all digits in " + num + " is " + sum);
    }
}
