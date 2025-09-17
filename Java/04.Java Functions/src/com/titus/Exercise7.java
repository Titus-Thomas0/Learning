package com.titus;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();

        if (isPrime(num)) System.out.println("Its prime");
        else System.out.println("Its not prime");
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
