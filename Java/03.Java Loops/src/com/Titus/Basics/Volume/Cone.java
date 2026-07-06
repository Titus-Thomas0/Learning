package com.Titus.Basics.Volume;

import java.util.Scanner;

public class Cone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius ");
        double radius = input.nextDouble();
        System.out.println("Enter the height ");
        double height = input.nextDouble();

        double volume = (Math.PI * radius * radius) * height / 3;

        System.out.println("The volume of cone is  " + volume);
    }
}
