package com.Titus.Basics.SurfaceArea;

import java.util.Scanner;

public class TotalSurfaceArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side ");
        int side = input.nextInt();

        int totalSurfaceArea = 6 * side * side;
        System.out.println("The total surface area of cube is  " + totalSurfaceArea);
    }
}
