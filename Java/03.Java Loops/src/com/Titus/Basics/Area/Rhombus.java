package com.Titus.Basics.Area;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the diagonal 1 ");
        double diagonal1 = input.nextDouble();

        System.out.println("Enter the diagonal 2 ");
        double diagonal2 = input.nextDouble();

        double area;

        area = diagonal1 * diagonal2 / 2;
        System.out.println("The area of rhombus is " + area);
    }
}
