package com.Titus.Advance;

import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the present value ");
        int pv = input.nextInt();
        System.out.println("Enter the interest rate ");
        double r = input.nextDouble();
        System.out.println("Enter the compounding years ");
        int n = input.nextInt();
        double fv = (pv * (Math.pow((1 + r), n)));
        System.out.println("Future value = " + fv);
    }
}
