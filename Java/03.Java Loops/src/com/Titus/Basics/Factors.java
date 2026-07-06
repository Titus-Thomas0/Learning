package com.Titus.Basics;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");

        int num = input.nextInt();
        int factor = 1;
        System.out.print(factor + " ");
        while (factor <= num) {
            factor++;
            if (num % factor == 0) {
                System.out.print(factor + " ");
            }
        }
    }
}
