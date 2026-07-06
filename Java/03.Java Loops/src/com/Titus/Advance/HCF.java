package com.Titus.Advance;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the num1 ");
        int num1 = input.nextInt();
        System.out.println("Enter the num2 ");
        int num2 = input.nextInt();
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("The HCF is " + num1);
    }
}
