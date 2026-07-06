package com.Titus.Basics.Perimeter;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius ");
        double radius = input.nextDouble();
        double perimeter = 2 * Math.PI * radius;

        System.out.println("The perimeter of circle is " + perimeter);
    }
}
