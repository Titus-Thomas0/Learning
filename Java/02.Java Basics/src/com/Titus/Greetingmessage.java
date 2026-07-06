package com.Titus;

import java.util.Scanner;

public class Greetingmessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = input.nextLine();
        System.out.println("Hello " + name + " welcome to the world of java");
    }
}
