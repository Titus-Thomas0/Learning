package com.Titus.Basics.Volume;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius ");
        double radius = input.nextInt();
        System.out.println("Enter the height ");
        double height = input.nextInt();

        double volume = (Math.PI * radius * radius) * height;
        System.out.println("The volume of cylinder is  " + volume);
    }
}
