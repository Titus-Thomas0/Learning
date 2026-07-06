package com.Titus.Basics.Perimeter;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side ");
        int side = input.nextInt();

        System.out.println("Enter the base ");
        int base = input.nextInt();

        int perimeter = 2 * (side + base);

        System.out.println("The perimeter of parallelogram is " + perimeter);
    }
}
