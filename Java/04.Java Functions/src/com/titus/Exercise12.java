package com.titus;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int first = input.nextInt();
        System.out.println("Enter second number");
        int second = input.nextInt();
        System.out.println("Enter third number");
        int third = input.nextInt();

        int sqFirst = first * first;
        int sqSecond = second * second;
        int sqThird = third * third;

        if (sqFirst + sqSecond == sqThird || sqSecond + sqThird == sqFirst || sqFirst + sqThird == sqSecond)
            System.out.println("The given numbers are pythagoran");
        else System.out.println("The given numbers are not pythagoran");
    }
}
