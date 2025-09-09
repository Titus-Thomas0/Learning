package com.Titus.Advance;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price ");
        double price = input.nextDouble();
        System.out.println("Enter the discount percentage ");
        int discountPercentage = input.nextInt();
        double discountedPrice = price - (price * discountPercentage / 100);
        System.out.println("Discounted price = " + discountedPrice);
    }
}
