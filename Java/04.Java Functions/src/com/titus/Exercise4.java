package com.titus;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int first = input.nextInt();
        System.out.println("Enter second number");
        int second = input.nextInt();

        int result = add(first, second);
        System.out.println("The sum of two numbers are " + result);
    }

    public static int add(int first, int second) {
        return first + second;
    }
}
