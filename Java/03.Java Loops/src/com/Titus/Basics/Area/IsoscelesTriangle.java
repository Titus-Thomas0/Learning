package com.Titus.Basics.Area;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the height ");
        double height = input.nextDouble();

        System.out.println("Enter the base ");
        double base = input.nextDouble();

        double area;

        area = height * base / 2;
        System.out.println("The area of isosceles triangle is " + area);
    }
}
