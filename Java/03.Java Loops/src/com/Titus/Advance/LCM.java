package com.Titus.Advance;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the num1 ");
        int num1 = input.nextInt();
        System.out.println("Enter the num2 ");
        int num2 = input.nextInt();
        int lcm = (num1 * num2) / gcd(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
    }
    public static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
