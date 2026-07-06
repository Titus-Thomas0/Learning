package com.Titus.Advance;

import java.util.Scanner;

public class NcrNdNpr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n ");
        int n = input.nextInt();
        System.out.println("Enter r ");
        int r = input.nextInt();
        int nPr = factorial(n) / factorial((n - r));
        int nCr = factorial(n) / (factorial(r) * factorial((n - r)));
        System.out.println("nPr = " + nPr);
        System.out.println("nCr = " + nCr);
    }
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = n; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }
}
