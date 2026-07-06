package com.Titus;

import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println("Largest number is " + num1);
        }
        else {
            System.out.println("Largest number is " + num2);
        }
    }
}
