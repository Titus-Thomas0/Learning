package com.titus;

import java.util.Scanner;

import static com.titus.Exercise7.isPrime;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter start number");
        int start = input.nextInt();
        System.out.println("Enter end number");
        int end = input.nextInt();

        for (int i = start; i <= end; i++) {
            if(isPrime(i)) System.out.print(i + " ");
        }
    }
}
