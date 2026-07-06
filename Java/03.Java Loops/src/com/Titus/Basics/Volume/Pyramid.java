package com.Titus.Basics.Volume;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length ");
        int length = input.nextInt();
        System.out.println("Enter the width ");
        int width = input.nextInt();
        System.out.println("Enter the height ");
        int height = input.nextInt();

        int volume = (length * width * height) / 3;
        System.out.println("The volume of pyramid is  " + volume);
    }
}
