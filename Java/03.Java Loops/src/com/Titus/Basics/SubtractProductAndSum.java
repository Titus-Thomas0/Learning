package com.Titus.Basics;

import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");

        int num = input.nextInt();
        int productNum = 1;
        int sumNum = 0;
        while (num != 0) {
            int temp = num % 10;
            productNum *= temp;
            sumNum += temp;
            num /= 10;
        }

        int result = productNum - sumNum;
        System.out.println(result);
    }
}
