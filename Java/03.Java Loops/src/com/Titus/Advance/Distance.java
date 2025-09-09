package com.Titus.Advance;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x1 ");
        int x1 = input.nextInt();
        System.out.println("Enter y1 ");
        int y1 = input.nextInt();
        System.out.println("Enter x2 ");
        int x2 = input.nextInt();
        System.out.println("Enter y2 ");
        int y2 = input.nextInt();

        double distance = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        System.out.println("The distance is " + distance);
    }
}
