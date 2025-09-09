package com.Titus.Basics.Area;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius ");
        double radius = input.nextDouble();
        double area;

        area = Math.PI * radius * radius;
        System.out.println("The area of circle is " + area);
    }
}
