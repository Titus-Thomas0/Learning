package com.Titus;

import java.util.Scanner;

public class Rupeeconvertion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rupees ");
        int rupees = input.nextInt();
        float usd = rupees * 0.011f;
        System.out.println("rupees " + rupees + " is " + usd + " in USD");
    }
}
