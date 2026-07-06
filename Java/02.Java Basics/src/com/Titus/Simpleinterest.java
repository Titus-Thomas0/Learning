package com.Titus;

import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter principle amount : ");
        int principle = input.nextInt();

        System.out.println("Enter time period : ");
        int time = input.nextInt();

        System.out.println("Enter rate of interest : ");
        int rate = input.nextInt();

        int SI = principle * time * rate / 100;
        System.out.println("The SI is : " + SI);
    }
}
