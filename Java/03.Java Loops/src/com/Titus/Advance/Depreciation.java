package com.Titus.Advance;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the asset cost ");
        int assetCost = input.nextInt();
        System.out.println("Enter the salvage value ");
        int salvageValue = input.nextInt();
        System.out.println("Enter the useful life ");
        int usefulLife = input.nextInt();
        int Depreciation = (assetCost - salvageValue) / usefulLife;
        System.out.println("Depreciation price per year = " + Depreciation);
    }
}
