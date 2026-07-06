package com.Titus;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Enter an operator");
        char operator = input.next().charAt(0);
        int result;

        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Sum is " + result);
        }
        else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Difference is " + result);
        }
        else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Product is " + result);
        }
        else if (operator == '/') {
            result = num1 / num2;
            System.out.println("Quotient is " + result);
        }
        else {
            System.out.println("Invalid operator");
        }
    }
}
