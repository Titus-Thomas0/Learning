package com.Titus.Basics.Area;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side length ");
        double side = input.nextDouble();

        double area;

        area = (Math.sqrt(3) / 4) * side * side;
        System.out.println("The area of triangle is " + area);
    }
}
