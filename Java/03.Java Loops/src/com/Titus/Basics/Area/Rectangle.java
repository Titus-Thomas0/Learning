package com.Titus.Basics.Area;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length ");
        double length = input.nextDouble();

        System.out.println("Enter the width ");
        double width = input.nextDouble();

        double area;

        area = length * width;
        System.out.println("The area of rectangle is " + area);
    }
}
