package com.titus;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius");
        int radius = input.nextInt();

        int area = area(radius);
        int circumference = circumference(radius);

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }

    public static int area(int radius) {
        return (int) Math.PI * radius * radius;
    }

    public static int circumference(int radius) {
        return (int) (2 * Math.PI * radius);
    }
}
