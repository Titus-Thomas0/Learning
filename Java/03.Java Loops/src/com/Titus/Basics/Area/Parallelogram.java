package com.Titus.Basics.Area;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base ");
        double base = input.nextDouble();

        System.out.println("Enter the height ");
        double height = input.nextDouble();

        double area;

        area = base * height;
        System.out.println("The area of parallelogram is " + area);
    }
}
