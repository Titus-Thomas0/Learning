package com.Titus.Basics.Perimeter;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Side ");
        int side = input.nextInt();
        int perimeter = 3 * side;

        System.out.println("The perimeter of equilateral triangle is " + perimeter);
    }
}
