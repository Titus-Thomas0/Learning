package com.Titus.Basics.SurfaceArea;

import java.util.Scanner;

public class CurvedSurfaceArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius ");
        double radius = input.nextDouble();
        System.out.println("Enter the height ");
        double height = input.nextDouble();

        double curvedSurfaceArea = (2 * Math.PI) * radius * height;
        System.out.println("The curved surface area of cylinder is  " + curvedSurfaceArea);
    }
}
