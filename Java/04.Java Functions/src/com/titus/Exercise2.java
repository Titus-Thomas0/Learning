package com.titus;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();
        String result = "zero";

        if(num != 0) {
            if (Integer.toBinaryString(num).endsWith("0")) {
                result = "even";
            }
            else {
                result = "odd";
            }
        }

        System.out.println("The given number " + num + " is " + result);
    }
}
