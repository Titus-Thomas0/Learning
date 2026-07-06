package com.titus;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 numbers");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();

        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);

        System.out.println("The largest number of 3 numbers are " + largest);
        System.out.println("The smallest number of 3 numbers are " + smallest);
    }

    public static int largest(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        return max;
    }

    public static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
        }
        return min;
    }
}
