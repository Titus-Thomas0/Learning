package com.Titus.Advance;

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the sale price ");
        double salePrice = input.nextDouble();
        System.out.println("Enter the commission percentage ");
        int commissionPercentage = input.nextInt();
        double commissionPrice = salePrice * commissionPercentage / 100;
        System.out.println("Commission price = " + commissionPrice);
    }
}
