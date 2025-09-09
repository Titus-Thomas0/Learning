package com.Titus.Basics.Volume;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius ");
        double radius = input.nextInt();

        double volume = ((double) 4 / 3 * Math.PI) * radius * radius * radius;
        System.out.println("The volume of sphere is  " + volume);
    }
}
