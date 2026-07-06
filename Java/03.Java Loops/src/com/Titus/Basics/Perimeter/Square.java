package com.Titus.Basics.Perimeter;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side ");
        int side = input.nextInt();

        int perimeter = 4 * side;

        System.out.println("The perimeter of square is " + perimeter);
    }
}
