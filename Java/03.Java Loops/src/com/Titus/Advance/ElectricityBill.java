package com.Titus.Advance;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the units consumed ");
        int units = input.nextInt();
        double amount;

        if (units <= 100) {
            amount = 0; // Rate for 1st 100 units
        }
        else if (units <= 400) {
            amount = (0) + ((units - 100) * 4.7); // Rate for 2nd 200 units
        }
        else if (units <= 500) {
            amount = (0) + (300 * 4.7) + ((units - 400) * 6.3); // Rate for 3rd 100 units
        }
        else if (units <= 600) {
            amount = (0) + (300 * 4.7) + (100 * 6.3) + ((units - 500) * 8.4); // Rate for 4th 100 units
        }
        else if (units <= 800) {
            amount = (0) + (300 * 4.7) + (100 * 6.3) + (100 * 8.4) + ((units - 600) * 9.45); // Rate for 5th 200 units
        }
        else if (units <= 1000) {
            amount = (0) + (300 * 4.7) + (100 * 6.3) + (100 * 8.4) + (200 * 9.45) + ((units - 800) * 10.5); // Rate for 6th 200 units
        }
        else {
            amount = (0) + (300 * 4.7) + (100 * 6.3) + (100 * 8.4) + (200 * 9.45) + (200 * 10.5) + ((units - 1000) * 11.55); // Rate for 7th remaining units
        }

        System.out.println("The total amount for " + units + " units is " + amount + " rupees.");
    }
}
